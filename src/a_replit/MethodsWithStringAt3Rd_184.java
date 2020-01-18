package a_replit;

public class MethodsWithStringAt3Rd_184 {

    public static void main(String[] args) {

        System.out.println(at3("longword","foo"));

    }

    public static String at3(String target,String word){


        String bla = target.substring(0,3) + word + target.substring(3);

        return bla;
    }
}
