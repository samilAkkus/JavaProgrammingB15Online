package a_replit;

import java.util.Scanner;

public class MiddleThree_073 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length() >=5 && word.length() % 2 !=0){

            int start = ((word.length()-1) / 2) -1;


            int finish = ((word.length()-1) / 2) + 2;


            System.out.println(word.substring( start , finish ));
        }else {

            System.out.println("invalid");
        }


    }
}
