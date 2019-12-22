package day26;

import java.util.Arrays;

public class LateNightPractice_Arrays {

    public static void main(String[] args) {


        int[] numbers = {3,5,2,8,4,7};

        int target = 4;

        System.out.println(Arrays.binarySearch(numbers,target));

        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers,target));

        String stringTarget = Arrays.toString(numbers);

        System.out.println(stringTarget);

        for (int number : numbers) {

            System.out.println(number);

        }


    }
}
