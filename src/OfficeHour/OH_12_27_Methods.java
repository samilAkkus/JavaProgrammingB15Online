package OfficeHour;

public class OH_12_27_Methods {

    public static void main(String[] args) {

        method1();

        method2();

        double blabla = method3();

        System.out.println("blabla = " + blabla);



    }

    public static void method1(){



        System.out.println("yarrak");



    }

    public static void method2(){

        if(true){

            return;
        }else {

            System.out.println("hhllow");
        }
    }

    public static double method3(){


        return 10.5f;
    }


}
