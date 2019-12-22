package a_replit;

import java.util.Scanner;

public class ArraysReverseSentence2_138 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] splitOne = sentence.split(" ");

        String[] reversedOne = new String[splitOne.length];

        String reversed = "";


        for (int x = 0; x < splitOne.length ; x++) {

            reversedOne[x] = splitOne[(splitOne.length-1) - x];

            reversed += reversedOne[x] + " " ;


        }

        reversed = reversed.substring(0, reversed.lastIndexOf(" "));

        System.out.println(reversed);



    }
}
