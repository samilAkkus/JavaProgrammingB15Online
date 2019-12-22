package day12;

public class WakeUpTask2_SeasonFinder {

    public static void main(String[] args) {

        int month = 12;

        if(month<1 || month>12){

            System.out.println("invalid month");
        }else{
            if(month>=3 && month<=5){
                System.out.println("its spring");
            }else{
                if(month>=6 && month<=8){
                    System.out.println("its summer");
                }else{
                    if(month>=9 && month<=11){
                        System.out.println("its fall");
                    }else{ // month==12 || month==1 || month==2
                        System.out.println("its winter");
                    }

                }
            }
        }








    }
}
//create a class called WarmUp_SeasonFinder
//create a variable called month with data type int
//and write an if else if ele statement to do following
//if the month is less than 1 or more than 12---invalid
//if the month is between 3-5 print its spring
//if the month is between 6-8 print its summer
//if the month is between 9-11 print its fall
//if the month is 12,1,2 print its winter!