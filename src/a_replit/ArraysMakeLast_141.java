package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMakeLast_141 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int[] doubles = new int[size*2];

        doubles[doubles.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(doubles));

    }
}
