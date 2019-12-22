package day08;

import java.util.Scanner;

public class LateNightPracticeIfShopping {

    public static void main(String[] args) {


        Scanner bla = new Scanner(System.in);

        System.out.println(" do u want to shop ");

        boolean answers = bla.nextBoolean();


        if(answers == true){
            System.out.println(" what do u want to buy ");

            String product1 = bla.next();

            System.out.println(" how many do u want to buy ");

            int countProduct = bla.nextInt();

            System.out.println(" you ve purchased " + countProduct + " " + product1);
        }else{
            System.out.println(" go home ");
        }
    }
}
