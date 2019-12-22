package day19;

public class FindingTheCount {
    public static void main(String[] args) {


        //from 1-100 count how many numbers can be divided by 15

        int x = 15;

        int counter = 0;


        for (int i = 1; i <=100 ; i++) {

            if( i % x == 0){

                System.out.println(i);
                ++counter;

            }

        }
        System.out.println(counter);





    }
}
