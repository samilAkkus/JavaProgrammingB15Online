package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindNonDuplicate_122 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};


        Arrays.sort(nums);


        int counter = 0;

        for (int x = 0; x < nums.length-1 ; x+=2) {

            if(nums[x] == nums[x+1]){

                ++counter;


            }

        }
        if(counter == 0){

            System.out.println(nums[0]);
        }else {
            if(counter == 1){

                System.out.println(nums[2]);
            }else{

                if(counter == 2){

                    System.out.println(nums[4]);
                }else {
                    if(counter == 3){

                        System.out.println(nums[6]);
                    }
                }
            }
        }












//        for (int x = 0; x <7 ; x++) {
//
//            if(nums[x] != nums[x+1]){
//
//                break;
//
//            }
//
//            System.out.println(nums[x+1]);
//
//        }


    }
}
