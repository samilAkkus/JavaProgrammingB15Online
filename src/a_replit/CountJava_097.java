package a_replit;

import java.util.Scanner;

public class CountJava_097 {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;

        for (int x = 0; x <word.length()-3 ; x++) {

//            System.out.println(word.substring(x,x+4));

            if(word.substring(x,x+4).contains("java")){

                ++count;
            }

        }
        System.out.println(count);



    }
}
