package a_replit;

import java.util.Scanner;

public class CountHi_098 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        for (int x = 0; x <= str.length()-2 ; x++) {

//            System.out.println(str.substring(x,x+2));

            if(str.substring(x,x+2).equals("hi")){

                ++count;
            }

        }
        System.out.println(count);

    }
}
