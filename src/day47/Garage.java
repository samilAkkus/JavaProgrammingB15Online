package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c = new Car();

        ElectricCar e1 = new ElectricCar();

        e1.goBackward();

        e1.turn("east");

        e1.goForward();


        // Create another sub class of Car called GasCar
        // add a instance field called gasLevel as int
        // implements all the abstract method of Car class

        GasCar g1 = new GasCar();

        g1.goForward();
        g1.goBackward();
        g1.start();
        g1.turn("left");

        g1.gasLevel = 60;
        System.out.println("g1.gasLevel: " + g1.gasLevel);



    }
}
