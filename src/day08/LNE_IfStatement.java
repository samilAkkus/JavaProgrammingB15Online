package day08;

public class LNE_IfStatement {

    public static void main(String[] args) {


        // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

        //if not Enjoy your Day
        //go shopping
        //Buy IceCream

        int currentSpeed = 75;
        int speedLimit = 80;

        boolean speeding = currentSpeed > speedLimit;

        if(speeding){
            System.out.println(" get pulled over by the police ");
            System.out.println(" given ticket by the police ");
            System.out.println(" taken away some points on your license ");
            System.out.println(" go to court ");
        }else{
            System.out.println(" Enjoy your Day ");
            System.out.println(" go shopping ");
            System.out.println(" Buy IceCream ");
        }
        System.out.println("THE END");
    }
}
