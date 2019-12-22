package a_replit;

import java.util.Scanner;

public class Factorial_092 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long sum = 1L;

        for (int x = 1; x <=n ; x++) {

//            System.out.println(x);

            sum = sum * x;



        }

        System.out.println(sum);

    }
}
