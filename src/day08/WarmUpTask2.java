package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {


        // create a program to check your fa number
        // create a variable called myFavoriteNumber as int
        // ask user to guess your fav number
        // if user guesses right print BINGO!!
        // if not print TRY AGAIN LATER
        Scanner bla = new Scanner(System.in);

        System.out.println(" Whats my fav number ");

        int myFavNumber = bla.nextInt();


        if (myFavNumber == 15){

            System.out.println(" BINGO!!");

        }else {

            System.out.println(" TRY AGAIN LATER ");
        }



        }



    }

