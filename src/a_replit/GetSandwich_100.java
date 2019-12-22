package a_replit;

import java.util.Scanner;

public class GetSandwich_100 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;

        for (int x = 0; x <=str.length()-5 ; x++) {

//            System.out.println(str.substring(x,x+5));

            if(str.substring(x,x+5).equals("bread")){

                ++count;


            }


        }
        if(count > 1){

            System.out.println(str.substring(str.indexOf("bread")+5 , str.lastIndexOf("bread")));
        }else {

            System.out.println("nothing");
        }
    }
}
