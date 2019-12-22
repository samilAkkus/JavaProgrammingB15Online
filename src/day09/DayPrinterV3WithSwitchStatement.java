package day09;

public class DayPrinterV3WithSwitchStatement {

    public static void main(String[] args) {


        int dayCode = 1;

        switch (dayCode){

            //1 is actual value you are checking
            //just like dayCode==1

            case 1 :
                System.out.println(" monday ");
                break; // used to get out of this branch

            case 2:
                System.out.println(" tuesday ");
                break;

            case 3:
                System.out.println(" wednesday ");
                break;
            case 4 :
                System.out.println(" thursday ");
                break; // used to get out of this branch

            case 5:
                System.out.println(" friday ");
                break;

            case 6 :
                System.out.println(" saturday ");
                break; // used to get out of this branch

            case 7:
                System.out.println(" sunday ");
                break;
            default:
                System.out.println(" unknown ");


        }


    }
}
