package a_replit;

import java.util.Arrays;
import java.util.List;

public class MethodsWithArraysMergeArrays_190 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergR(new int[]{2, 3, 4, 5}, new int[]{4, 5, 6, 7})));



    }

    public static int[] mergR(int[] a,int[] b){

        int[] myList = new int[a.length+b.length];

        for (int i = 0; i < a.length ; i++) {

            myList[i] = a[i];

        }

        int z =0;

        for (int i = a.length; i < a.length+b.length ; i++) {

            myList[i] = b[z];

            ++z;

            if(z == b.length){

                break;
            }



        }

        return myList;



    }
}
