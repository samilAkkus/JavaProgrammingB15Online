package day11;

public class LogicalOperator {

    public static void main(String[] args) {


        // combining multiple condition together
        // in java there is no range check directly like math
        //for ex int x = 70;
        // int math : 60 < x < 100  -----> true(60<x) < 100

        // in java : x > 60 && x < 100

        // && 2 ampersand & 1 ampersand ----> logical and operator
        //// this is used to check to both conditions are true at the same time

        // int x = 70; x > 60 && x < 100 ; true

        // int x = 10; x > 60 && x < 100 ; false

        // int x = 110; x > 60 && x < 100 ; false

        // int x = 99; x > 60 && x < 100 ; true

        // || pipe or | pipe is used for compiling 2 conditions : logical OR operator

        // if you have 2 conditions to check
        // when will this be true : as long as one side is true, whole result will be true
        // think about buying milk from 2 stores:
        //// as long as you found the milk in the store, you got the milk then u get out!

        // int x = 70; x > 60 || x < 100 ; true
        // int x = 110; x > 60 || x < 100 ; true
        // int x = 7; x > 10 || x < 5 ; false

        System.out.println("truth table");
        System.out.println("result of the true && true is " +(true && true));
        System.out.println("result of the false && true is " +(false && true));
        System.out.println("result of the true && false is " +(true && false));
        System.out.println("result of the false && false is " +(false && false));

        System.out.println("result of the true || true is " +(true || true));
        System.out.println("result of the false || true is " +(false || true));
        System.out.println("result of the true || false is " +(true || false));
        System.out.println("result of the false || false is " +(false || false));

        // as long as one side is true, final result is true




    }
}
