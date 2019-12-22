package day08;

import java.util.Scanner;

public class LNE_GuessMyFavNum {

    public static void main(String[] args) {


//        Create a program to guess your favorite number
//         *  create a variable called myFavoriteNumber as int
//         *  Ask user to guess your favorite number
//                *  if user guessed right  300  then print BINGO!!
//                *  if not 300 print try again later

        Scanner bla= new Scanner(System.in);

        System.out.println(" Whats my fav number");

        int myFavNumber = bla.nextInt();

        if(myFavNumber == 300){
            System.out.println("BINGO!!");
        }else{
            System.out.println("TRY AGAIN LATERRRR");
        }

        System.out.println("THE ENDD");
    }
}
