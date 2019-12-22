package day13;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args) {

        //create a boolean store the result of youWantToShop
        //if yes, do u want to go to store or do u wanna shop online


        boolean youWantToShop = true;

        String preference = "Store";

        if(youWantToShop==true){       //if(youWantToShop)---same

            if(preference.equals("Store")){
                System.out.println("going store for shopping");
            }else{
                System.out.println("going online for shopping");
            }


        }else{
            System.out.println("good job stay home coding");
        }



    }
}
