package a_replit;

import java.util.Scanner;

public class ArraysHas55_136 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int counter = 0;


        for (int x = 0; x < nums.length-1 ; x++) {


            if((nums[x] == nums[x+1]) && (nums[x] ==5) ){

                ++counter;
            }
        }

        if(counter > 0){

            System.out.println("true");
        }else {

            System.out.println("false");
        }


    }
}
