package a_replit;

import com.sun.source.tree.LiteralTree;

import java.util.Scanner;

public class MethodsIsPositive_154 {

    public static void main(String[] args) {

        Scanner  inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        for (int each : arr) {

            isPos(each);

        }

    }

    public static void  isPos (int num){

        if(num > 0 ){

            System.out.println("positive");

        }else {

            System.out.println("not positive");
        }


    }
}
