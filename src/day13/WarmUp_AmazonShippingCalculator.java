package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {


        //amazon has 2 type of user one is prime, other one is regular
        //prime member gets free shipping in all purchase no matter the amount
        //regular member gets free shipping only if their purchase is more than 25$
        //otherwise they get 5$ shipping fee

        String memberType = "prime member";

        double amount = 15.99d;
        int shippingFee = 0;
        //first i wanna check if its prime or not

        if(memberType.equalsIgnoreCase("prime mEmBer")){

            System.out.println("You get 1 day free shipping");
            System.out.println("Your final price is "+amount);


        }else{
            if(amount>25){ // we could add !memberType.equalsIgnoreCase("prime mEmBer") to make it clear
                System.out.println("not a prime but your order is more than 25");
                System.out.println(" you got free shipping " + amount);

            }else {
                System.out.println("do u wanna sign up for prime membership?");
                shippingFee = 5;
                amount = amount+shippingFee; //amount += shippingFee
                System.out.println("Your final amount is "+amount);
            }
        }




    }
}
