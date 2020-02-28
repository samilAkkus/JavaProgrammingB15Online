package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        System.out.println("=========================");

        Shape[] s11 = new Shape[]{s1,s2,s3, new Triangle(), new Circle()};

        for (Shape eachShape : s11) {

            eachShape.draw();

        }
        System.out.println("=========================");

        List<Shape> shapeArrayList = new ArrayList<>(Arrays.asList(s1,s2,s3,new Circle()));
        shapeArrayList.add(new Circle());


        for (Shape eachShapeList : shapeArrayList) {

            eachShapeList.draw();

        }


    }


}