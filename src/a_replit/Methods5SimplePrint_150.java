package a_replit;

public class Methods5SimplePrint_150 {

    public static void main(String[] args) {

        printHollowRect();

    }

    public static void printHollowRect(){

        for (int x = 0; x < 5 ; x++) {

            for (int y = 0; y < 5 ; y++) {

                if(x == 0 || x == 4 || y == 0 || y == 4 ){

                    System.out.print("*");
                }else {

                    System.out.print(" ");
                }

            }
            System.out.println();

        }



    }


}
