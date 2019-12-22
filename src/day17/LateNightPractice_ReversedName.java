package day17;

import java.util.Scanner;

public class LateNightPractice_ReversedName {

    public static void main(String[] args) {


        Scanner bla = new Scanner(System.in);

        System.out.println("enter name amk");

        String name = bla.next();

        int x = name.length()-1;

        while (x>=0){

            System.out.print(name.charAt(x)+ " ");
            --x;
        }
    }
}
