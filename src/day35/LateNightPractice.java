package day35;

import java.util.Arrays;
import java.util.Scanner;

public class LateNightPractice {

    public static void main(String[] args) {



        Integer num1 = Integer.valueOf("200");

        System.out.println(num1+1);

        String num1String = String.valueOf(num1);

        System.out.println(num1String+1);

        System.out.println("=================================");



        int num3 = 10;

        String num3String = String.valueOf(num3);

        System.out.println(num3String+1);

        System.out.println("=================================");

        //with the help of toCharArray, we split our String to parts and turn it to an Array!!!


        String bla = "polonezkoydeyim";


        char[] namesChar = bla.toCharArray();

        System.out.println(Arrays.toString(namesChar));

        System.out.println("=================================");


        //String split

        String bla2 = "I really with no doubt LOVE java";

        String[] arrayJava = bla2.split(" ");

        System.out.println(Arrays.toString(arrayJava));

        String[] arrayJava1 = bla2.split(" ",2);

        System.out.println(Arrays.toString(arrayJava1));


        System.out.println("=================================");


//        Scanner scan = new Scanner(System.in);
//
//        int n = scan.nextInt();
//
//        int[] numbers = new int[n];
//
//        for (int x = 0; x < n ; x++) {
//
//            numbers[x] = scan.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(numbers));

        System.out.println("=================================");

//        Scanner scan = new Scanner(System.in);
////
////        int n = scan.nextInt();
////
////        int m = scan.nextInt();
////
////        int[][] doubleArray = new int[n][m];
////
////        for (int x = 0; x < n ; x++) {
////
////            for (int y = 0; y < m ; y++) {
////
////                doubleArray[x][y] = scan.nextInt();
////
////
////
////            }
////
////        }
////
////        System.out.println(Arrays.deepToString(doubleArray));









    }
}
