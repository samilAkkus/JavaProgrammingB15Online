package a_replit;

import java.util.Scanner;

public class Arrays_CountOfEvenNumber_113 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        int evenCount = 0;
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();

            if(nums[i] % 2 ==0){

                ++evenCount;

            }

        }
        System.out.println(evenCount);


    }
}
