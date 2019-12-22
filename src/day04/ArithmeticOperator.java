package day04;

public class ArithmeticOperator {


    public static void main(String[] args) {


//        System.out.println( 5 + 3);
//        System.out.println( 5 - 3);
//        System.out.println( 5 * 3);
//        System.out.println( 5 / 3);


        // arithmetic operator between two 2 int ---->> another int

        // it just takes the whole number part

//        ---------------------------------------
//        System.out.println( 5 + 3.0d);
//        System.out.println( 5 - 3.0d);
//        System.out.println( 5 * 3.0d);
//        System.out.println( 5 / 3.0d);
//        System.out.println( 5 / 3.0f);

//        -------------------------------------------

        // store above numbers in variable
        // and replace above statements with variables instead
        // dataType result1 = the calculation here

//        double five = 5d;
//        double three = 3d;
//        double result1 = 5 + 3;
//
//        System.out.println(" 5 + 3 is " + result1);

//        -------------------------------

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;

        double res1 = num1 + num2;
        double res2 = num1 - num2;
        double res3 = num1 * num2;
        double res4 = num1 / num2;
        float res5 = num1 / num3;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);




    }
}
