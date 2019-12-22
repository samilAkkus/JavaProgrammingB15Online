package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {


        // logical not operator--- exclamation mark used to negate the boolean value

        System.out.println(true);
        System.out.println(false);
        System.out.println(!true); // its like flipping the coin..!!!
        System.out.println(!false);

        boolean isRecording = false;

        System.out.println(!isRecording);

        // third you can use it in front of a boolean expression
        // boolean expression is any expression that result in a boolean value
        // for ex 7>5 , x>10 , y==20 , x<= 100 , x>y , x>10 && x<100

        System.out.println( !(7>5) );

        int x = 10;
        System.out.println( !(x>10) );

    }
}
