package a_replit;

import java.util.Scanner;

public class PrintLastCharacter_064 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length()-1));
    }
}
