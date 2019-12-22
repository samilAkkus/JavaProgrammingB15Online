package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" whats your name ");

        String name = scan.next();

        // .next can only capture 1 word

        String anotherWord = scan.next();



        System.out.println(" you ve entered " + name);

        System.out.println(" you ve entered " + anotherWord);
    }
}
