package day06;

import java.util.Scanner;

public class lateNightPractice {

    public static void main(String[] args) {


        Scanner ac = new Scanner(System.in);

        System.out.println(" Whats your birth year ");

        int birthYear = ac.nextInt();

        int age = (2019 - birthYear);

        System.out.println(" you are " + age + " years old ");
    }
}
