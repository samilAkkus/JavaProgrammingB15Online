package day21;

public class OrderOfBreakContinue {

    public static void main(String[] args) {


        for (int x = 1; x <=10 ; x++) {

            break;

//            System.out.println("the end"); //this will never work,unreachable code



        }

        System.out.println("the end");
    }
}
