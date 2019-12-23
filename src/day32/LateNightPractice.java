package day32;

public class LateNightPractice {

    public static void main(String[] args) {

        System.out.println(plus(5,10));

        System.out.println(findInt(new int[]{0,1,2,3} , 0));

    }

    public static int plus( int num1 , int num2){

        return num1+num2;

    }


    public static int findInt(int[] arrayOne, int target ){


        if(arrayOne[0] == target){

            return 100000;
        }else {

            return -1;
        }



    }

}
