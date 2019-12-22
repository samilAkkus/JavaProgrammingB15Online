package a_replit;

import java.util.Scanner;

public class VideoGameCoupons_037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();

        int candyBars = coupons/10;

        int gumBalls = (coupons%10)/3;

        if(coupons>=3){
            System.out.println("Number of Candies: "+candyBars);
            System.out.println("Number of Gumballs: "+gumBalls);
        }else{
            if(coupons<3){
                System.out.println("Not enough coupons");
            }
        }
    }
}
