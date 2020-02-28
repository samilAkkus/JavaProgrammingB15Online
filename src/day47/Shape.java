package day47;

public abstract class Shape {

    int area;
    String name;

    public Shape( String name) {

        this.name = name;
    }

    public abstract void calculateArea();

    public abstract String toString();
}
