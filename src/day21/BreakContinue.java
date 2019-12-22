package day21;

public class BreakContinue {

    public static void main(String[] args) {


        for (int x = 1; x <=5 ; x++) {

            System.out.println(x);

            if(x==5){/////////////AFTER 5TH ITERATION IT WILL STOP ANYWAYS, POINTLESS!!!!

                break;
            }

            continue; // this is pointless
            //because after each iteration
            //its going to next iteration anyway!

        }
    }
}
