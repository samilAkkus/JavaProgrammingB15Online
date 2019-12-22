package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {


        String name = "Samil";

        char[] nameChars = name.toCharArray();

        System.out.println(Arrays.toString(nameChars));

        for (char nameChar : nameChars) {

            System.out.println(nameChar);


        }

        int count = 0;

        for (char eachChar : nameChars) {

            if(eachChar == 'a'){

                ++count;
            }

        }
        System.out.println(count);

        Arrays.sort(nameChars);

        System.out.println("nameChars in order = " + Arrays.toString(nameChars));

    }
}
