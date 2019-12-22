package a_replit;

import java.util.Arrays;

public class Arrays2DMultiplication_143 {

    public static void main(String[] args) {

        int [][] multiplicationTable = new int[10][10];

        for (int i = 1; i <=10  ; i++) {


            multiplicationTable[0][i-1] = i;

        }

        for (int n = 1; n <=10 ; n++) {

            multiplicationTable[n-1][0] = n;

        }


        for (int x = 0; x < 10 ; x++) {

            for (int y = 0; y < 10 ; y++) {

                multiplicationTable[x][y] = multiplicationTable[0][x] * multiplicationTable[y][0];

            }



        }

        System.out.println(Arrays.deepToString(multiplicationTable));



    }
}
