package day35;

import java.util.Arrays;

public class CharacterPractice2 {

    public static void main(String[] args) {


        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();
        
        int sum = 0;

        for (char each : allChars) {
            
            if(Character.isDigit(each)){

                sum += Integer.parseInt(String.valueOf(each));
            }
            
        }

        System.out.println(sum);


    }
}
