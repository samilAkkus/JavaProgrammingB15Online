package a_replit;

import java.util.Scanner;

public class Arrays_FindSum_114 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for (int x = 0; x <5 ; x++) {

            sum += nums[x];



        }
        System.out.println(sum);
    }
}
