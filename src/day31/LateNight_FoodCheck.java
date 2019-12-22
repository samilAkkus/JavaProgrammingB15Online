package day31;

public class LateNight_FoodCheck {

    public static void main(String[] args) {

        foodCheck("pizza");

        foodCheck("lahmacun");

        foodCheck("hamburger");

        foodCheck("ananin amcigi");




    }

    public static void foodCheck(String food){



        switch (food){

            case "hamburger":

                System.out.println("hamburger? wow delicious");
                break;
            case "pizza":

                System.out.println("pizza? i love pizza");
                break;

            case "lahmacun":

                System.out.println("amina koyum bayiliyorum");
                break;
            default:

                System.out.println("baska bisey yemem ben aq");
        }



    }
}
