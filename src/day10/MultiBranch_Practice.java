package day10;

import java.util.Scanner;

public class MultiBranch_Practice {

    public static void main(String[] args) {


        // at the mcdonald drive through

        System.out.println(" what can i get for u");

        //11, burger
        //5, french fries
        //8, nuggets
        //35, ice cream
        //55, coke

        String order = "";

        int itemNumber = 35;

        if(itemNumber==11){

            order = "burger";

        }else
            if(itemNumber==5){

                order = " french fries";

            }else
                if(itemNumber==8){

                    order= "nuggets";
                }else
                    if(itemNumber==35){

                        order= "ice cream";

                    }else
                        if(itemNumber==55){

                            order= "coke";
                        }else{
                            order = "unknown item";
                        }
        System.out.println(" your order is" + order);;



    }
}
