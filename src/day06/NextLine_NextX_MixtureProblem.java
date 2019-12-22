package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println(" Whats your name ");

        String name = blabla.nextLine();

        System.out.println(" your name is " + name);

        System.out.println(" Whats your age ");

        int age = blabla.nextInt();

//        String age = blabla.nextLine();
        // we can use String for age as well!!!!!!

        blabla.nextLine();

        // to solve the problem we need to add blabla.nextLine() and it will capture enter keyboard

        System.out.println(" your age is " + age);

        System.out.println(" Whats your address ");

        String address = blabla.nextLine();

        System.out.println(" your address is " + address);








    }
}
