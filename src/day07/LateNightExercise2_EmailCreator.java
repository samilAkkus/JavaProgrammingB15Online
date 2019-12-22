package day07;

import java.util.Scanner;

public class LateNightExercise2_EmailCreator {

    public static void main(String[] args) {


        Scanner bla = new Scanner(System.in);

        System.out.println(" whats your name ");

        String name = bla.next();

        System.out.println(" whats your last name ");

        String lastName = bla.next();

        System.out.println(" whats your company ");

        String company = bla.next();

        System.out.println(" your new email address is " + name + "_" + lastName + "@" + company + ".com");
    }
}
