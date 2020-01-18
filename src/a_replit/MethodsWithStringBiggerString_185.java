package a_replit;

public class MethodsWithStringBiggerString_185 {
    public static void main(String[] args) {

        System.out.println(biggerS("apple","orange"));

    }

    public static String biggerS(String a ,String b){

        if(a.length() > b.length()){

            return a;
        }
        return b;
    }
}
