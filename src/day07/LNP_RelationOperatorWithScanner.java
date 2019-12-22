package day07;

import java.util.Scanner;

public class LNP_RelationOperatorWithScanner {

    public static void main(String[] args) {


        Scanner bla = new Scanner(System.in);

        System.out.println(" whats the number ");

        int num = bla.nextInt();

        System.out.println( num > 8 );
        System.out.println( num >= 10 );
        System.out.println( num < 3 );
        System.out.println( num <=9 );
        System.out.println( num == 10 );
        System.out.println( num != 10 );
    }
}
