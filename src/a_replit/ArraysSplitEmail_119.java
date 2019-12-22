package a_replit;

import java.util.Scanner;

public class ArraysSplitEmail_119 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        int count = 0;

        String[] allWords = email.split("@");

        for (int x = 0; x <=email.length()-1 ; x++) {

            if(email.charAt(x) == '@'){

                ++count;
            }

        }

        if(count ==1){

            System.out.println("Email id: "+allWords[0]);
            System.out.println("Email domain: "+allWords[1]);
        }else {

            System.out.println("invalid email");
        }





    }
}
