package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintShortestWord2_126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String [] allWords = str.split(", ");


        String shortest = allWords[0];

        String shorts = "";



        for (int x = 0; x < allWords.length ; x++) {

            if(allWords[x].length() < shortest.length()){

                shortest = allWords[x];
            }


        }

        for (int y = 0; y < allWords.length ; y++) {

            if(allWords[y].length() == shortest.length()){

                shorts += allWords[y]+" ";

            }

        }

        String[] lastShorts = shorts.split(" ");

        Arrays.sort(lastShorts);

        System.out.println(Arrays.toString(lastShorts));







    }
}
