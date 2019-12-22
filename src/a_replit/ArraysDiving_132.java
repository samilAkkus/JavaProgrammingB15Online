package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDiving_132 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float[] bla = new float[5];
        float sum = 0;
        float total = 0;

        for (int x = 0; x < score.length ; x++) {

            System.out.println("Enter score for judge "+ (x+1)+":");

            score[x] = input.nextFloat();



        }

        Arrays.sort(score);

        for (int y = 0; y < 5 ; y++) {

            bla[y] = score[y+1];

        }

//        System.out.println(Arrays.toString(bla));

        for (int z = 0; z < 5 ; z++) {

            sum += bla[z];

        }

        System.out.println("Enter difficulty:");

        float dif = input.nextFloat();

        sum = sum * dif;

        total = (float) (sum * 0.6);

        System.out.printf("Total: %.2f", total);





    }
}
