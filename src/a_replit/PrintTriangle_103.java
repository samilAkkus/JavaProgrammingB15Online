package a_replit;

import java.util.Scanner;

public class PrintTriangle_103 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int x = 1; x <=n ; x++) {
//            System.out.println("x : " + x);

            for (int y = 1; y<=x ; y++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
