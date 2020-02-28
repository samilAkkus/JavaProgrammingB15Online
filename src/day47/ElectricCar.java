package day47;

public class ElectricCar extends Car {


    @Override
    public void start() {

        System.out.println("This is how electric car start");

    }

    @Override
    public void goForward() {

        System.out.println("electricCar going forward");

    }

    @Override
    public void goBackward() {
        System.out.println("electricCar going backward");

    }

    @Override
    public void turn(String direction) {

        System.out.println("turning to "+direction);

    }

    int batteryLevel;




}
