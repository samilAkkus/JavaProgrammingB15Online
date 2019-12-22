package a_replit;

import java.util.Scanner;

public class ArraysPrint3_118 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++) {
            arr[i] = input.nextLine();
        }

        for (int x = 0; x <1 ; x++) {

            System.out.println(arr[x]+" , "+arr[x+1]+" , "+arr[x+2]);
            System.out.println(arr[x+1]+" , "+arr[x+2]+" , "+arr[x+3]);
            System.out.println(arr[x+2]+" , "+arr[x+3]+" , "+arr[x+4]);
            System.out.println(arr[x+3]+" , "+arr[x+4]+" , "+arr[x+5]);

        }

    }
}
