package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {


        long[] salaries = {99000L , 110000L,180000L,250000L,156000L};

        for (long eachSalary : salaries){

            System.out.println("eachSalary = " + eachSalary);;
        }

        for (long moreThan : salaries){

            if(moreThan > 100000){

                System.out.println(moreThan);
            }
        }


    }
}
