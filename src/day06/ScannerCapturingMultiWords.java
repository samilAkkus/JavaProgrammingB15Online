package day06;

import java.util.Scanner;

public class ScannerCapturingMultiWords {

    public static void main(String[] args) {


        Scanner blabla = new Scanner(System.in);
//
//        System.out.println(" whats your name ");
//
//        //nextLine method of scanner is used to capture whole line
//
//        String name = blabla.nextLine();
//
//        System.out.println(" you ve entered " + name);

        // task //
        // use nextLine to ask your bio
        // whats your name
        // which city u live in, including state
        // whats your street address

        System.out.println(" whats your name ");

        String name = blabla.nextLine();

        System.out.println(" whats your city ");

        String city = blabla.nextLine();

        System.out.println(" whats your street ");

        String street = blabla.nextLine();

        System.out.println(" your name is " + name + " your city is " + city + " your streeet address is " + street);


    }
}
