package day05;

import java.util.Scanner;

public class HourToSecondScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" how many days u lookin for");

        int day = scan.nextInt();
        int minute = (day * 24 * 60);

        System.out.println(day + " day has " + minute + " minutes " );

    }
}
