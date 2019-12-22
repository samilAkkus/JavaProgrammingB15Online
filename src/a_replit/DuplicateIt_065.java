package a_replit;

import java.util.Scanner;

public class DuplicateIt_065 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1+word2+word2+word1);
    }
}
