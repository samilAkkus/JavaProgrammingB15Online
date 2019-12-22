package day06;

import java.util.Scanner;

public class ScannerUsingOther {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" Whats your order, i want same ");

        String myOrder = input.nextLine();

        String yourOrder = myOrder;

        System.out.println(" Your order is " + yourOrder +"\n" + " My order is " + myOrder);




    }
}
