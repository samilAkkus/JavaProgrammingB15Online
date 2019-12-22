package day22;

public class MultiplicationTable {

    public static void main(String[] args) {


//        System.out.println("1 x 1 = "+1);
//        System.out.println("1 x 2 = "+2);

        int sum = 1;

        for (int i = 1; i <=12 ; i++) {


            for (int j = 1; j <=12 ; j++) {

                sum = i * j ;
                System.out.println(i+" x "+j+" = "+sum);




            }



        }
    }
}
