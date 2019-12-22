package a_replit;

import java.util.Scanner;

public class ArraysFindMax_115 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;

        for (int x = 0; x < 5 ; x++) {

            if(nums[x] > max){

                max = nums[x];
            }

        }
        System.out.println(max);
    }
}
