package a_replit;

import java.util.Scanner;

public class OnlineBookMerchants_084 {

    public static void main(String[] args) {


        int freeBooks;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer==true && nbooksPurchased >=5 && nbooksPurchased<8){

            freeBooks = nbooksPurchased / 5;
            System.out.println(freeBooks);


        }else {

            if(isPremiumCustomer==true && nbooksPurchased >= 8 ) {

                freeBooks = nbooksPurchased / 4;
                System.out.println(freeBooks);
            }else {

                if(isPremiumCustomer==false && nbooksPurchased>=7 && nbooksPurchased<12 ){

                    freeBooks = nbooksPurchased / 7;

                    System.out.println(freeBooks);
                }else{

                    if(isPremiumCustomer==false && nbooksPurchased >=12){

                        freeBooks =nbooksPurchased / 6;
                        System.out.println(freeBooks);
                    }else {
                        System.out.println("0");
                    }
                }
            }
        }
    }
}
