package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {


        //get the sum of numbers from 1-10
        //1+2+3+4+5+6+7+8+9+10

        int sum = 0;

        for (int i = 1; i <=10 ; i++) {

            sum = sum + i;
            System.out.print(i+" ");
            System.out.println(sum);

        }
        System.out.println(sum );

    }
}
// create a program to ask user two number
//sum numbers within the range