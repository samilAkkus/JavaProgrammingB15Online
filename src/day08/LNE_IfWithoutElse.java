package day08;

import java.util.Scanner;

public class LNE_IfWithoutElse {
    public static void main(String[] args) {

        Scanner bla= new Scanner(System.in);

        System.out.println(" whats speed limit ");

        int speedLimit = bla.nextInt();

        System.out.println(" whats current speed ");

        int current = bla.nextInt();

        if(current>=speedLimit){

            System.out.println(" go to jail ");
        }
        System.out.println(" THE END ");
    }
}
