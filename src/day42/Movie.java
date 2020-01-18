package day42;

public class Movie {

   private String name;
   private double length;
   private String type;

    public Movie(){

        System.out.println("empty movie");

    }

    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}


