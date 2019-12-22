package a_replit;

import java.util.Scanner;

public class HasAJava_093 {

    public static void main(String[] args) {


        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if( !word.contains("java")         ||         word.substring(2).contains("java")){

            System.out.println(false);
        }else {

            if( word.substring(0,4).contains("java") || word.substring(1).contains("java") ){

                System.out.println(true);
            }


        }
    }
}
