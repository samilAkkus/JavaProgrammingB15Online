package day21;

public class OddPrinter10Times {

    public static void main(String[] args) {


        for (int i = 1; i <=4 ; i++) {

            for (int x = 1; x <=10 ; x++) {

                if(x % 2 ==1){

                    System.out.println(x);
                }

            }
            System.out.println("==================");

        }
    }
}
