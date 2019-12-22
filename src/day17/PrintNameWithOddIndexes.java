package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {

    public static void main(String[] args) {


        Scanner bla = new Scanner(System.in);

        System.out.println("enter name amk");

        String name = bla.nextLine();

        int x = 0;

        while(x<name.length()){

            if( x % 2 !=0 ){

                System.out.print(name.charAt(x));
            }
            ++x;
        }
    }
}
