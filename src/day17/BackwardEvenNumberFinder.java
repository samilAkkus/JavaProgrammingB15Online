package day17;

public class BackwardEvenNumberFinder {

    public static void main(String[] args) {

        //print from 100 to 0
        //use if statement 100-98-96-94....-0
        int num = 100;

        while (num>=0){

            if(num % 2 == 0){

                System.out.println(num+ " is even number");
            }else {
//                System.out.println(num+" is odd number");
            }
            --num;
        }

    }
}
