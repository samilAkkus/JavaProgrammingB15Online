package day19;


import java.util.Scanner;

public class SpeedAction_Scanner_ALL {

    public static void main(String[] args) {

        //create 2 int called start and end

        //create a for loop stimulate slow increase of the speed,
        //for ex.. if start 10 , end 27
        //10,11,12,13,,,,,,27

        /////////////////////////////////////////////////////

        Scanner scan = new Scanner(System.in);

        System.out.println("enter start and end amk");


        int start = scan.nextInt();

        int end = scan.nextInt();

        System.out.println("u have started at speed-->>");

        if(start<end){
            System.out.println("increasing");

            for (int i = start; i <= end ; i++) {

                System.out.println(i+" ,");

            }
        }else{
            if(start>end){
                System.out.println("decreasing");

                for (int i = start; i >= end ; i--) {

                    System.out.println(i+" ,");

                }
            }else {
                System.out.println("same speed no action");
            }
        }
    }
}
