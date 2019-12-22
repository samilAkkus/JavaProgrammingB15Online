package a_replit;

import java.util.Scanner;

public class ArraysReverseSentence_137 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] splitSentence = sentence.split(" ");
        String[] bla = new String[splitSentence.length];

        for (int x = 0; x < splitSentence.length ; x++) {

            bla[x] = splitSentence[(splitSentence.length-1) - x];

        }

        for (String s : bla) {

            System.out.println(s);

        }

    }
}
