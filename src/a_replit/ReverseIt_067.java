package a_replit;

import java.util.Scanner;

public class ReverseIt_067 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int firstOne = 0;

        int lastOne = word.length()-1;

        if(word.length() == 5){

            for (int i = lastOne ; i >= firstOne ; i--) {

                System.out.print(word.charAt(i));

            }


        }else {

            if (word.length() < 5){
                System.out.println("Too short!");

            }else {
                System.out.println("Too long!");
            }

        }

    }
}
