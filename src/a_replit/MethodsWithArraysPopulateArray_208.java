package a_replit;

import java.util.Arrays;

public class MethodsWithArraysPopulateArray_208 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(populate(new int[3])));

    }

    public static int[] populate(int[] r){

        for (int i = 0; i < r.length ; i++) {

            r[i] = i+1;

        }

        return r;



    }
}
