package a_replit;

import java.util.Scanner;

public class TernaryOperator_60 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

//        String result = (x>=5) ? ""+x : "-"+x;
//
//        System.out.println(result);

        int result;

        result = (x>=5) ? x : -x;

        System.out.println(result);





    }
}
