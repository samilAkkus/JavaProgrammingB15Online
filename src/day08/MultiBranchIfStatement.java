package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {


        // pseudo code

        // given your currentSpeed , speedLimit

        // check whether the currentSpeed is
        ////more than 90---jail
        ////more than 80 and less than 90-- reckless driving

        // start here//


        ///more than 70 --- point taken
        ////more than 60 and less than 70-- warning
        ////if not speeding keep driving

        // try out 45, 65, 75


        int currentSpeed = 75;

        int speedLimit = 60;

        if(currentSpeed > 60 ){

            System.out.println(" u are speeding more than 70---point taken ");
        }else{

            if( currentSpeed > 70 ){

                System.out.println(" your speed limit is less than or equal 70 but more than 60--warning ");
            }else{
                System.out.println(" keep driving ");
            }
        }



    }
}
