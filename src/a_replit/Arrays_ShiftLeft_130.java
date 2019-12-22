package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ShiftLeft_130 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        int[] ex = new int[size];


        for(int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();


        }
        int bla = nums[0];

        for (int x = 1; x < size   ; x++) {

            ex[x-1] = nums[x];


        }

        ex[ex.length-1] = bla;


        System.out.println(Arrays.toString(ex));








    }
}
