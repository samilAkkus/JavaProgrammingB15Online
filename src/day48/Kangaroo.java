package day48;

public class Kangaroo implements Bouncible {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("kangaroo is bouncing");

    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    public void eat(){

        System.out.println("kangaroo is eating");
    }


}
