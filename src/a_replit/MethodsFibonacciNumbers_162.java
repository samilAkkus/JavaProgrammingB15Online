package a_replit;

import java.util.Scanner;

public class MethodsFibonacciNumbers_162 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);




    }

    public static void fib(int num){

        int[] numbers = new int[num];



        numbers[0] = 0;
        numbers[1] = 1;



        for (int x = 2; x < numbers.length ; x++) {

            for (int y = 0; y < numbers.length-2 ; y++) {

                numbers[x] = numbers[y] + numbers[y+1];


                ++x;



            }

        }

        System.out.println(numbers[numbers.length-1]);
    }
}
