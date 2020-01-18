package a_replit;

public class MethodsWithStringLimitString_183 {

    public static void main(String[] args) {

        System.out.println(limit("bla bla",3));



    }

    public static String limit(String text, int maxLength){

        String bla = text.substring(0,maxLength);

        return bla;
    }
}
