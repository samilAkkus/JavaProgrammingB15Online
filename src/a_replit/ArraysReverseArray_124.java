package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseArray_124 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt()
                ,input.nextInt(),input.nextInt(),input.nextInt()};

        int[] reversed = new int[nums.length];

        for (int x = 0; x <= nums.length-1 ; x++) {

            reversed[x] = nums[(nums.length-1)-x];




        }

        nums = reversed;

        System.out.println(Arrays.toString(nums));



    }
}
