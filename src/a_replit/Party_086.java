package a_replit;

import java.util.Scanner;

public class Party_086 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String guests = "";

        System.out.println("Please enter guest name:");

        String name = input.next();

        System.out.println("Do you want to enter new guest name:");

        String answer = input.next();



        while (answer.equals("yes")){

            System.out.println("Please enter guest name:");

            String guest = input.next();

            guests = guests +", "+guest;
            System.out.println("Do you want to enter new guest name:");

            answer = input.next();



        }
        System.out.println("Guest's list: "+name+guests);
    }
}
