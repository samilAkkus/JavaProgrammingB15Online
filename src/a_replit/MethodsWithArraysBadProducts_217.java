package a_replit;

public class MethodsWithArraysBadProducts_217 {

    public static boolean badP(int[] products,int limit){

        int counter = 0;

        for (int i = 0; i < products.length ; i++) {

            if(products[i] == 0){

                ++counter;
            }

        }

        return counter < limit;




    }
}
