package day55.association;

import day55.association.Driver;
import day55.association.Engine;
import day55.association.Taxi;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6",400);

        Driver d1= new Driver("samil",1453);

        Taxi t1 = new Taxi(101,en,d1);

        System.out.println("t1 = " + t1);

        System.out.println("t1.dr.name = " + t1.dr.name);

        System.out.println("t1.eng.horsePower = " + t1.eng.horsePower);
    }
}
