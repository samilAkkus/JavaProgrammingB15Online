package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {



        Drawable d1 = new Circle("yarrak" , 3);
        System.out.println(d1);


        Shape s1 = new Circle("amcik" , 2);
        s1.calculateArea();
        System.out.println(s1);

        Circle c1 = new Circle("kiki" , 5);
        System.out.println(c1);
        c1.calculateArea();
        System.out.println(c1);

        Shape s2 = new Square("bibi" , 10);
        System.out.println(s2);

        Object o1 = new Circle("gigi" , 6);


        Shape s3 = new Circle("penny", 5);

        print(s3);




        Drawable d7 = new Circle("pee" , 2);
        print((Shape) d7);

        drawShape3Times(s3);


    }

    public static void print(Shape any){

        any.calculateArea();
        System.out.println(any.area);
    }

    public static void drawShape3Times(Shape anyShape){

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }
}
