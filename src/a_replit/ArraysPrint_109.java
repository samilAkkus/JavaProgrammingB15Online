package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrint_109 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for (int x = 0; x <5 ; x++) {

            System.out.println(arr[x].substring(0,3));

        }


    }
}
