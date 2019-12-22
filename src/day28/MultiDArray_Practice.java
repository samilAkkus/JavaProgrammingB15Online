package day28;

import java.util.Arrays;

public class MultiDArray_Practice {

    public static void main(String[] args) {




        //assign a 2d array. print 3 elements of the array
        //find length of array
        //print 1d arrays
        //find lengths of 1d arrays


        int[][] myExcel = {{10,27},{87,99,100},{90,45}};

        //print 87

        System.out.println(myExcel[1][0]);

        //print 90

        System.out.println(myExcel[2][0]);

        //print 10

        System.out.println(myExcel[0][0]);

        System.out.println("============================");


        System.out.println("Printing 1d arrays: ");

        System.out.println("first"+Arrays.toString(myExcel[0]));
        System.out.println("second"+Arrays.toString(myExcel[1]));
        System.out.println("third"+Arrays.toString(myExcel[2]));

        System.out.println("length of 1d arrays");

        System.out.println("first 1d array length: "+myExcel[0].length);
        System.out.println("second 1d array length: "+myExcel[1].length);
        System.out.println("third 1d array length: "+myExcel[2].length);

        System.out.println("============================");

        System.out.println("print ALL 2d array");

        System.out.println(Arrays.deepToString(myExcel));


        System.out.println("length of 2d array: "+myExcel.length);

        System.out.println("============================");

        System.out.println("PRINTING 1D ARRAYS BY LOOP");

        for (int x = 0; x < myExcel.length ; x++) {

            System.out.println("Item Number "+ x + " Array is: "+Arrays.toString(myExcel[x])+
                    "Array length is: "+myExcel[x].length);

        }

        //printing by using each loop

        System.out.println("============================");
        System.out.println("============================");

        for (int[] bla : myExcel) {

            for (int blabla : bla) {

                System.out.print(blabla+" ");

            }
            System.out.println();

        }

        System.out.println("============================");

        for (int[] ints : myExcel) {

            System.out.println(ints[0]);

        }

        System.out.println("============================");

        for (int[] intsv : myExcel) {

            for (int i : intsv) {

                System.out.println(i);

            }

        }
    }
}
