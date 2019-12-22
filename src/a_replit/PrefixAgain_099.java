package a_replit;

import java.util.Scanner;

public class PrefixAgain_099 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;

        for (int x = 0; x <=str.length()-n ; x++) {

//            System.out.println(str.substring(x,x+n));

            if(str.substring(x,x+n).equals(str.substring(0,n))){

                ++count;
            }



        }
        if(count > 1){

            System.out.println(true);
        }else {

            System.out.println(false);
        }






        }






    }

