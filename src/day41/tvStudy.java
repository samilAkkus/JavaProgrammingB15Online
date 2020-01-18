package day41;


public class tvStudy {

    public static void main(String[] args) {


        TV t1 = new TV();

        t1.brand = "samsung";

        t1.isOn = false;

        t1.currentChannel = 1;

        t1.turnOn();

        System.out.println(t1.toString());

        t1.setCurrentChannel(4);

        System.out.println(t1.toString());

        t1.moveForward();

        System.out.println(t1.toString());

        t1.moveBackward();

        System.out.println(t1.toString());

        System.out.println(t1.getCurrentChannel());

        t1.turnOff();

        System.out.println(t1.toString());

        System.out.println(t1);







    }
}
