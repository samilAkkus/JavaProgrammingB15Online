package day31;

public class LateNightPractice {


    public static void main(String[] args) {

        sayHello("matafaka");
        sayHello("anasi sikisik");

        sayAnan("sikildi");


        sayHelloAnan();


    }



    public static void sayHello(String bla){

        System.out.println("hello "+ bla);


    }

    public static void sayAnan(String blabla){

        System.out.println("Anan "+blabla);
    }

    public static void sayHelloAnan(){


        sayAnan("ibne");
        sayHello("matir");
    }
}
