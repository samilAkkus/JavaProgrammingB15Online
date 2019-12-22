package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner bla = new Scanner(System.in);

        System.out.println(" whats your current speed ");

        int currentSpeed = bla.nextInt();

        System.out.println(" whats speed limit ");

        int speedLimit = bla.nextInt();

        if(currentSpeed>=speedLimit){

            System.out.println(" get pulled over by the police ");
            System.out.println(" given ticket by police ");
            System.out.println(" go to court ");

        }
        System.out.println(" THE END OF STORY ");



    }
}
