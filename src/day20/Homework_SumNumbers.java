package day20;

import java.awt.*;
import java.util.Scanner;

public class Homework_SumNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter 2 numbers to find sum within range");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = 0;

        for (int i = num1 ; i <= num2 ; i++) {

            sum = sum+i;
            System.out.println(sum);

        }

        System.out.println("final sum = " + sum);
    }
}
