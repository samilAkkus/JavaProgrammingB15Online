package a_replit;

import java.util.Scanner;

public class SliceNumber_107 {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;


        Scanner bla = new Scanner(System.in);

        System.out.println("Enter your number:");

         num = bla.nextInt();

         digit1 = num / 10000;

         digit2 = (num % 10000) / 1000;

         digit3 = ((num % 10000) % 1000) / 100;

         digit4 = (((num % 10000) % 1000) % 100) / 10;

         digit5 = (((num % 10000) % 1000) % 100) % 10;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
    }
}
