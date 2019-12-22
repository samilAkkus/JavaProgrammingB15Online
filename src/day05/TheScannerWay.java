package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {


        // ask user for name
        // print your name is this
        // ask user for birth year
        // print the age
        // ask user for height
        // print the height

        Scanner scan = new Scanner(System.in);

        // scan is variable name you can change it

        System.out.println(" Whats your name ");

        String name = scan.next();

        System.out.println(" your name is " + name);

        //-----------------------------------------------//

        System.out.println(" Whats your birth year ");

        int birthYear = scan.nextInt();

        int age = (2019 - birthYear);

        System.out.println(" your age is " + age);

        //-------------------------------------------------//

        System.out.println(" whats your height ");

        double height = scan.nextDouble();

        System.out.println(" your height is " + height);






    }

}
