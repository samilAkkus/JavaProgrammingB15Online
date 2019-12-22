package a_replit;

import java.util.Scanner;

public class CaffeineOverDose_033 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink");

        int enterMg = s.nextInt();

        int overdose = 10000/enterMg;

        System.out.println("It would take about "+overdose+" drinks for a lethal overdose");
    }
}
