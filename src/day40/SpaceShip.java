package day40;

public class SpaceShip {

    String name;
    int xCoordinate;
    int yCoordinate;
    String currentDirection; // up,down,left,right

    public void setInitialPosition( int p1 , int p2){

        xCoordinate = p1;
        yCoordinate = p2;


    }

    public void setDirection(String d1){

        if(     d1.equalsIgnoreCase("up")   ||
                d1.equalsIgnoreCase("down") ||
                d1.equalsIgnoreCase("left") ||
                d1.equalsIgnoreCase("right")   ){

            currentDirection = d1;

        }else {

            System.out.println("Invalid Direction");
        }


    }
    public void move1Block(){

        if(currentDirection.equals("up")){

            yCoordinate +=1;
        }else {
            if(currentDirection.equals("down")){

                yCoordinate -=1 ;
            }else {

                if(currentDirection.equals("right")){

                    xCoordinate +=1;
                }else {

                    if(currentDirection.equals("left")){

                        xCoordinate -=1;
                    }
                }
            }
        }


    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }

    public void move1Block(String newDirection){

        setDirection(newDirection);
        move1Block();



    }
}
