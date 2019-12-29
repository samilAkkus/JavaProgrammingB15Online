package a_replit;

import java.util.Arrays;

public class ArraysCopyCertainValues_129 {

    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        int eCount = 0;

        for (int x = 0; x < arr.length ; x++) {

            if(arr[x].contains("e")){

                ++eCount;

            }


        }

        String few = "";

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].contains("e")){

                few += arr[i]+" ";
            }

        }

        String[] fewValues = few.split(" ");






        return fewValues;
    }


}
