package day20;

import java.util.Scanner;

public class Homework_AZ_ZA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 character please");

        String firstCharacter = scan.next();

        String secondCharacter = scan.next();

        char firstCorrect = firstCharacter.charAt(0);

        char secondCorrect = secondCharacter.charAt(0);

        if(firstCorrect < secondCorrect){

            for ( char iChar = firstCorrect ; iChar <= secondCorrect ; iChar++) {

                System.out.println(iChar);

            }

        }else{

            if(secondCorrect < firstCorrect){

                for (char kChar = firstCorrect ; kChar >= secondCorrect ; kChar--) {

                    System.out.println(kChar);

                }
            }
        }
    }
}
