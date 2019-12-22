package day12;

import java.util.Scanner;

public class T5_Scanner_SeasonAction_equalsIgnoreCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your season please");

        String season = scan.next();

        if(season.equalsIgnoreCase("spring")){

            System.out.println("hiking,navruz,allergy season");
        }else{
            if(season.equalsIgnoreCase("summer")){
                System.out.println("pool,swim,beach");
            }else{
                if(season.equalsIgnoreCase("fall")){
                    System.out.println("bbq,riding bike,code");
                }else{
                    if (season.equalsIgnoreCase("winter")){
                        System.out.println("code,ski,snowman");
                    }else{
                        System.out.println("your input has not been found");
                    }
                }
            }
        }






    }
}
//create a String variable call season
//assign value vy asking user question: enter your season please
//check the season using if statement without caring about case
//if spring---hiking,navruz,allergy season
//if summer---pool,swim,beach
//if fall---bbq,riding bike,code
//if winter---code,ski,snowman