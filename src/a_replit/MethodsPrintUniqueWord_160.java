package a_replit;

import java.util.Scanner;

public class MethodsPrintUniqueWord_160 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){


        int count = 0;

        for (int x = 0; x < words.length ; x++) {

            for (int y = 0; y < words.length ; y++) {

                if(words[x].equals(words[y])){

                    ++count;
                }

            }

            if(count < 2){

                System.out.println(words[x]);
            }

            count = 0;

        }

    }






}
