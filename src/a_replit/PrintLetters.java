package a_replit;

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char x = start ; x <=end ; x++) {

            System.out.print(x);

        }
    }
}
