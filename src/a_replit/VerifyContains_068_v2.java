package a_replit;

import java.util.Scanner;

public class VerifyContains_068_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(word));

    }
}