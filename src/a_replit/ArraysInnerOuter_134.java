package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerOuter_134 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        int counter = 0;

        for (int x = 0; x < sizeInner ; x++) {

            for (int z = 0; z < sizeOuter ; z++) {

                if(inner[x] == outer[z]){

                    ++counter;
                   ++x;
                   if(x == sizeInner){

                       break;
                   }




                }


            }

        }

        if(counter == inner.length){

            System.out.println("true");
        }else {

            System.out.println("false");
        }

    }
}
