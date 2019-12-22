package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintFirstLast_140 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] firstLast = new String[words.length];

        for (int x = 0; x < words.length ; x++) {

            firstLast[x] = ""+ words[x].charAt(0)+words[x].charAt(words[x].length()-1);

        }

        System.out.println(Arrays.toString(firstLast));
    }
}
