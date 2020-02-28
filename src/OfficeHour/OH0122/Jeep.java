package OfficeHour.OH0122;

public class Jeep extends Car {

    public void start(){

        System.out.println("call mechanic");
    }

    public static void main(String[] args) {

        Jeep j1 = new Jeep();

        j1.start();
    }
}
