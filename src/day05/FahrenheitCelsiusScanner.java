package day05;

import java.util.Scanner;

public class FahrenheitCelsiusScanner {

    public static void main(String[] args) {


        Scanner samil = new Scanner(System.in);

        System.out.println(" What is the temperature in F? ");

        double fahrenheit = samil.nextDouble();

        double celsius = (5.0 / 9) * ( fahrenheit - 32);

        System.out.println(fahrenheit + " fahrenheit is " + celsius + " celsius ");
    }
}
