package day10;

public class MultiBranch_Practice_WithSwitch {

    public static void main(String[] args) {


        // at the mcdonald drive through

        System.out.println(" what can i get for u");

        //11, burger
        //5, french fries
        //8, nuggets
        //35, ice cream
        //55, coke

        String order = "";

        int itemNumber = 11;

        // we can just use byte, short, int, char, String

        switch (itemNumber) {

            case 11:

                order = " burger";
                break; // if break doesnt show up here
            // it will move on to next case

            case 5:

                order = " french fries";
                break;

            case 35:

                order = " ice cream";
                break;

            case 55:

                order = " coke";
                break;
            default:

                order = "unknown";


        }

        System.out.println("your order is" + order);


    }
}
