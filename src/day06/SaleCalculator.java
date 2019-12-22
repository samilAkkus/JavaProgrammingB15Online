package day06;

import java.util.Scanner;

public class SaleCalculator {


    public static void main(String[] args) {


        // wake up task
        // create a program to calculate the final discounted price of an item

        // create 3 variable called regularPrice, salePrice and discount

        // ask user question using scanner for regularPrice and discount
        //and  save the result into the variable

        // calculate salePrice using above info.

        // for ex: 80 regular price, 0.2 for discount, salePrice = 64

        // print out your regular price is 80, discount is 0.2 and your got deal for 64$

        Scanner sale = new Scanner(System.in);

        System.out.println(" whats your Regular Price?");

        int regularPrice = sale.nextInt();

        System.out.println(" whats your discount?");

        double discount = sale.nextDouble();

        double salePrice = regularPrice - (regularPrice * discount);

        System.out.println(" your regular price is " + regularPrice + "$ , discount is " + discount +
                " and your deal is " + salePrice + "$");


        //if variables have same data type,
        // we can do like this;


        // double regularPrice;
        // double salePrice;
        // double discount;

        // ---> double regularPrice , salePrice , discount ;



    }
}
