package a_replit;

import java.util.Scanner;

public class Arrays_SplitSentence_135 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] sentenceSplit = sentence.split(" ");

        for (String s : sentenceSplit) {

            System.out.println(s);

        }

    }
}
