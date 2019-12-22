package day08;

public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 45;

        boolean amISpeeding = ( yourCurrentSpeed > speedLimit );

        // INSIDE PARENTHESIS WE CAN PUT
        // BOOLEAN VALUE: TRUE FALSE
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE


//        if (amISpeeding){
//        if (true) {
          if (yourCurrentSpeed > speedLimit){
            System.out.println(" get pulled over by the police ");
            System.out.println(" given ticket by police ");
            System.out.println(" go to court ");

        }else{

            System.out.println(" go shopping!!! ");
        }

        System.out.println(" THE END ");



    }
}
