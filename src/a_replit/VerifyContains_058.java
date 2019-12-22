package a_replit;

import java.util.Scanner;

public class VerifyContains_058 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean verify = sentence.contains(word);

        System.out.println("verify = " + verify);


    }
}
