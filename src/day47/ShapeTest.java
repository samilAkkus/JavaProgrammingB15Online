package day47;

import day44.Train;

public class ShapeTest {

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle(10,20);

        System.out.println("r1 = " + r1);

        r1.calculateArea();

        System.out.println("r1 = " + r1);

        Triangle t1 = new Triangle(10,10);

        t1.calculateArea();
        System.out.println("t1 = " + t1);
    }
}
