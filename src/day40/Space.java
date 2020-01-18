package day40;

public class Space {

    public static void main(String[] args) {


        SpaceShip s1 = new SpaceShip();

        s1.name = "Valhalla";
        s1.xCoordinate = 1;
        s1.yCoordinate = 2;
        s1.currentDirection = "up";

        System.out.println(s1);

        s1.move1Block();
        System.out.println(s1);

        s1.setInitialPosition(4,6);

        System.out.println(s1);
        s1.setDirection("down");
        System.out.println(s1);

        s1.move1Block("left");

        System.out.println(s1);
    }
}
