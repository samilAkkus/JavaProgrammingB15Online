package day11;

public class LogicalOperator_Single {

    public static void main(String[] args) {


        // && 2 ampersand & 1 ampersand ----> logical and operator
        //// this is used to check to both conditions are true at the same time

        // && is called short circuit AND
        //// it does not check the next condition as long as first condition is false
        //---- just like if you have multiple condition for rocket launching
        ///// isEngineRunning , isCommunicationSystemWorking , isAirEnough

        ///// isEngineRunning && isCommunicationSystemWorking && isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions



        // & ---> check each and every condition no matter what
        ///// isEngineRunning & isCommunicationSystemWorking & isAirEnough
        // if isEngineRunning is false
        // it still checks isCommunicationSystemWorking
        // it still checks isAirEnough
        // and eventually give u the outcome

//        System.out.println(7>5 && 1>7);
//        System.out.println(5>5 && 1>7);
//        System.out.println(1>5 && 9>7);
//
//        System.out.println(7>5 & 1>7);
//        System.out.println(5>5 & 1>7);
//        System.out.println(1>5 & 9>7);

//        System.out.println( 9/0 ); // error!! cant divide by 0

        // i want to check whether dividing 9 by 0 is 3

//        System.out.println(9/0==3); // error!!

        //combine the result of 5 is more than 10 and 9 divided by 0 is 3

        System.out.println( 5>10 && 9/0==3 );
        // when it see that first is false and u have &&, it just stops there and gives u false result

        System.out.println( 5>10 & 9/0==3 );
        // when you have &, it will check even tough you have false and &..

        //////////////////////////////////////////////////////////////

        //combine the result of
        // checking 10 is more than 5
        // or 9 divide by 0 is 3

        System.out.println(10 > 5 || 9/0==3 );
        // when it sees that first one is true and u got ||, it just stops there and gives u true result
        // it does not calculate the second part of it

        System.out.println(10 > 5 | 9/0==3 );
        // when u have |, it will check even if you have true and |...


    }
}
