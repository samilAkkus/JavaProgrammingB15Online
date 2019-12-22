package day26;

import day14.StringReview;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {


        // given an int array write a program to test all the element int this int array are more than 100
        // create a variable called finalResult to store your result of checking if every number in this array
            // is more than 100 or not


        int[] scores  = {156,3,110,187,198,110};

        String finalResult = "";
        int count = 0;

        for (int score : scores) {

            if(score > 100){

                ++count;
            }

        }

        if(count == scores.length){

            finalResult = "yes";

            System.out.println(finalResult);
        }else {

            finalResult = "no";
            System.out.println(finalResult);
        }
    }
}
