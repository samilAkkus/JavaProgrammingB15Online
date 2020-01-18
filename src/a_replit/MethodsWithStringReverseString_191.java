package a_replit;

public class MethodsWithStringReverseString_191 {

    public static void main(String[] args) {

        System.out.println(reverse("samil"));

    }

    public static String reverse(String input){

        String reversed = "";

        for (int i = input.length()-1 ; i >= 0 ; i--) {

            reversed += ""+ input.charAt(i);


        }

        return reversed;
    }
}
