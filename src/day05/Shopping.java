package day05;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {


//        Task 5 : Grocery Shopping
//    *   ask user whats the price of tomato and store it
//        ask user how many tomato you want to buy and store it
//    *   ask user whats the price of potato and store it
//        ask user how many potato you want to buy and store it
//    *   ask user whats the price of banana and store it
//        ask user how many banana you want to buy and store it
//
//        generate this example output
//        You got 3 tomato price is 2.99 and total -->>
//        You got 5 potato price is 3.49 and total -->>
//        You got 2 banana price is 1.99 and total -->>
//
//                Your grand total for this shopping is ????


        Scanner scan = new Scanner(System.in);

        System.out.println(" whats price for potato ");

        float potatoPrice = scan.nextFloat();

        System.out.println(" how many u wanna buy ");

        int potatoCount = scan.nextInt();

        System.out.println(" your total for potato is " + (potatoPrice * potatoCount));



    }
}
