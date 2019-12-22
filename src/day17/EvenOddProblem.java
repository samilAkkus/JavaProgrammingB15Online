package day17;

public class EvenOddProblem {

    public static void main(String[] args) {


        //white a program to print out a even number from 0-50
        //white a program to print out a odd number from 0-50

        int evenCounter = 0;

        while(evenCounter<=50){

            System.out.print(evenCounter+" ");

            evenCounter +=2;


        }
        System.out.println("==============================");

        int oddCounter = 1;
        while(oddCounter<=50){

            System.out.print(oddCounter+" ");
            oddCounter +=2;

        }

        System.out.println("=============================");

        int cnt = 0;

//        if (cnt%2 ==0){
//            System.out.println(cnt+" is even number");
//        }else{
//            System.out.println(cnt+ " is odd number");
//        }
        while(cnt<=50){

            if(cnt%2==0){
                System.out.println(cnt+" is even number");
            }else
                System.out.println(cnt+ " is odd number");
            ++cnt;
        }



    }
}
