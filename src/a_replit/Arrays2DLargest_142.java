package a_replit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2DLargest_142 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        int max = arr[0][0];

        for(int x=0 ;x<=rows-1;x++)
        {
            for(int z=0 ;z<=cols-1;z++)
            {
                if(arr[x][z] > max){

                    max = arr[x][z];
                }
            }
        }

        System.out.println(max);




    }
}
