package day11;

public class WakeUpTask_LightOnOff {

    public static void main(String[] args) {


        //you have 4 switches in your home to turn on
        //Bd--bedroom
        //Lr--living room
        //Ki--kitchen
        //Ha--hallway

        // create a variable : targetOption as string and assign
           // one of the above options for ex bd

        // use switch statement to write a program to print which room light is turned on

        //// fox ex if bd was targetOption
        // then print you have turned on bedroom light


        String targetOption = "lr";

        switch (targetOption){

            case "bd":
                System.out.println("you have turned on bedroom light");
                break;
            case "lr":
                System.out.println("you have turned on living room light");
                break;
            case "ki":
                System.out.println("you have turned on kitchen light");
                break;
            case "ha":
                System.out.println("you have turned on hallway light");
                break;
            default:
                System.out.println("invalid input");
                break;

        }


    }
}
