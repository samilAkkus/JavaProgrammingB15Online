package day20;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {


        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 10; i <=100 ; i++) {

            if(i % 2 == 0){

                sumOfEven = sumOfEven+i;


            }else {

                sumOfOdd = sumOfOdd+i;
            }



        }
        System.out.println("sumOfEven : "+sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}
