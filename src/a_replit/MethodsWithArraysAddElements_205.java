package a_replit;

import java.util.Arrays;

public class MethodsWithArraysAddElements_205 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(addElements(new int[]{3, 4, 5}, new int[]{2, 3, 4})));

    }

    public static int[] addElements(int[] ints1, int[] ints2){

        int[] together = new int[ints1.length];


        for (int i = 0; i < together.length ; i++) {

            together[i] = ints1[i] + ints2[i];

        }

        return together;





    }
}
