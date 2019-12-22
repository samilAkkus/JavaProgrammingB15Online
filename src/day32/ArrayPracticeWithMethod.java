package day32;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        findMax(new int[]{4,10,15,66});





    }

    public static void findMax(int[] bla ){

        int max = 0;


        for (int x = 0; x < bla.length ; x++) {

            if(bla[x] > max){

                max = bla[x];
            }

        }

        System.out.println(max);
    }
}
