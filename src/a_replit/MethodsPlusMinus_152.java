package a_replit;

import java.util.Scanner;

public class MethodsPlusMinus_152 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void  plus_minus(int[] ar ){


        int positive = 0;
        int negative = 0;
        int zeros = 0;


        for (int x = 0; x < ar.length ; x++) {

            if(ar[x] > 0){

                ++positive;
            }else {

                if(ar[x] < 0){

                    ++negative;
                }else {

                    if(ar[x] == 0){

                        ++zeros;
                    }
                }
            }

        }

         System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zeros);




    }
}
