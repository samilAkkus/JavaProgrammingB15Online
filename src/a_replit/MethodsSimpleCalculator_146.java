package a_replit;

import java.util.Scanner;

public class MethodsSimpleCalculator_146 {

    public static void main(String[] args) {

        plus();

    }

    public static void plus(){


        Scanner bla = new Scanner(System.in);

        int num1 = bla.nextInt();
        int num2 = bla.nextInt();

        int sum = num1+num2;

        System.out.println("result: "+sum);
    }



}
