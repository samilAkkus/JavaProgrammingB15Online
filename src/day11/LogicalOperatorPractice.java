package day11;

public class LogicalOperatorPractice {

    public static void main(String[] args) {


        // create a variable called num with int
        // find out whether this number is more than 100 or less than 10

        // find out the number is within the range of 10-60
        // and print out the result

        int num = 55;

        System.out.println(num > 100 || num < 10);
        System.out.println(num > 10 && num < 60);

        //////////////////////////////////////////////////////////////////


        // more than 2 condition at the same time,, 3 conditions

        System.out.println(true || false || false); // true
        System.out.println(true && false && false); // false

        /////////////////////////////////////////////////////////////////////
                            //false    false      true --------  true
        System.out.println( num ==9 || num==51 || num==55    );

        //////////////////////////////////////////////////////////////////////

        // check num is more than 50 and x is not 52 or x equal to 57

//                           true    true
//                                          true false  ----true

        System.out.println(num > 50 && num!=52 || num==57);

        System.out.println( false || true && false);





    }
}
