package a_replit;

import java.util.Scanner;

public class Arrays_PrintFirstLastChar_110 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int x = 0; x < words.length ; x++) {

            System.out.println(""+words[x].charAt(0)+words[x].charAt(words[x].length()-1));

        }
    }
}
