package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAddToArray_156 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }

    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] new_r = new int[r.length+1];

        for (int x = 0; x < r.length ; x++) {

            new_r[x] = r[x];



        }

        new_r[new_r.length-1] = n;

        System.out.println(Arrays.toString(new_r));


    }
}
