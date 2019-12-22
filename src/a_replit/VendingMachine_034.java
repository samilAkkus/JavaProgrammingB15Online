package a_replit;

import java.util.Scanner;

public class VendingMachine_034 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter price in cents:");

        int itemPrice = s.nextInt();

        int change = 100-itemPrice;

        int quarters = change/25;

        int dimes = (change%25)/10;

        int nickels = ((change%25)%10)/5;

        if(itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else{
            if(itemPrice%5 !=0){
                System.out.println("Invalid price!");
            }else{
                System.out.println("Your chance is "+quarters+" quarters, "
                        +dimes+", and "+nickels+" nickels.");
            }
        }


    }
}
