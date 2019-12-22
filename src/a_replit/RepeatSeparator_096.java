package a_replit;

import java.util.Scanner;

public class RepeatSeparator_096 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = word;



        for (int i = 1; i <count ; i++) {

            result = result  + separator+ word;






        }
        System.out.println(result);


















    }
}
