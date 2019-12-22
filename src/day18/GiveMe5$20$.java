package day18;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {


        //keep asking for 5$ or 20$ till u get

        Scanner scan = new Scanner(System.in);

        System.out.println("give me 5 or 20");

        int x = scan.nextInt();

        while ( x != 5 && x != 20){ // while(  !(x==5 || x==20)  ){

            System.out.println("not the bill im looking for");
            System.out.println("pls gimme 5 or 20");
            x = scan.nextInt();
        }
        System.out.println("happy ending");

    }
}
