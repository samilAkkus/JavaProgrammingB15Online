package day06;

public class CoinConverter {

    public static void main(String[] args) {

        //you have 2 dollar
        //how many dime u can with this 10c
        //how many quarter 25c
        //how many  nickel 5c
        //how many penny


        int cent = 200;

        // u have purchase candle for 74 cent,
        // what would be your remainder

        cent -= 74; // 126cent

        int quarter = cent/25;

        int penny = cent%25;

        System.out.println(quarter);

        System.out.println(penny);

        int dime = cent/10;

        System.out.println(dime);

        int dimePenny = cent%10;

        System.out.println(dimePenny);







    }
}
