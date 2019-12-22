package a_replit;

import java.util.Scanner;

public class Arrays_FindingMaxLength_120 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];



        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();


        }
        String longest = words[0];
        for (String currentWord : words) {

            if(currentWord.length() > longest.length()){

                longest = currentWord;


            }

        }
        System.out.println(longest);




    }
}
