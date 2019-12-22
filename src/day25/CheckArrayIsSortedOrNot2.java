package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {

    public static void main(String[] args) {

//         int[] nums = {13,31,8,5,21,2} ;
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums = " + Arrays.toString(nums));
        boolean isAlready = true;


        for (int x = 0; x <nums.length-1 ; x++) {

            System.out.println("is " +nums[x]+" less than "+nums[x+1]+"?"+ (nums[x]<nums[x+1]));



            if(!(nums[x]<nums[x+1])){

//                System.out.println("array is not sorted, no point checking the rest");
                isAlready = false;
                break;
            }




        }
        System.out.println("isAlready = " + isAlready);






    }

}