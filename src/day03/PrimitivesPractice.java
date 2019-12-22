package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {




        byte letterCount = 26 ;

        short sheepCount = 300 ;

        System.out.println("sheep count is " + sheepCount);

        int catCount = 20 ;

        System.out.println("cat count is " + catCount);

        long mileToMoon = 5000000l ;

        System.out.println("mile to moon is " + mileToMoon);

        long mileToSun = 10000000L ;

        System.out.println(" mile to sun is " + mileToSun);

        //------------------ floating point-----------------//

        // it has to have f right after number to indicate this is float data type

        float priceOfBanana = 1.99f ;

        System.out.println("price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49F ;

        System.out.println("price of potato is " + priceOfPotato);

        //---------------- larger floating point numbers------------//

        double priceOfIpad1 = 355.99d ;

        System.out.println(" price of ipad 1 is " + priceOfIpad1);

        double priceOfIpadPro = 1024.99D ;

        System.out.println("price of ipadpro is " + priceOfIpadPro);

        // compiler automatically assume its a double so its not required to have d
        // however for good programming habit, add them always
        double priceOfMac = 2299.99 ;

        System.out.println(" price of mac is " + priceOfMac);


        // IMPORTANT++++++++//

        // if you have a whole number by itself, compiler automatically assume its an int
        // if you have a fractional number by itself, compiler automatically assume its an double












    }
}
