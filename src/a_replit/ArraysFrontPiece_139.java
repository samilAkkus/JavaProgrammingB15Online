package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiece_139 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        int[] twoSize = new int[2];
        int[] oneSize = new int[1];

        if(size > 1){

            twoSize[0] = num[0];
            twoSize[1] = num[1];

            System.out.println(Arrays.toString(twoSize));

        }else {

            oneSize[0] = num[0];

            System.out.println(Arrays.toString(oneSize));
        }

    }
}
