package day20;

public class SumOfOdd {
    public static void main(String[] args) {


        //give me the sum of odd numbers from 10-100

        int sum = 0;
        int counter = 0;

        for (int i = 10; i <=100 ; i++) {

            if(i % 2 !=0 ){

                sum = sum+i;
                ++counter;

            }


        }
        System.out.println(sum);
        System.out.println(counter);
    }
}
