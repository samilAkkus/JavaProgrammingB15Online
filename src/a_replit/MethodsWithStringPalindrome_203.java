package a_replit;

public class MethodsWithStringPalindrome_203 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Noon"));
        System.out.println(isPalindrome("I am not palindrome"));
        System.out.println(isPalindrome("wooden"));
        System.out.println(isPalindrome("Nurses Run"));


    }


    public static boolean isPalindrome(String check){

        String reverse = "";

        check = check.toLowerCase();
        check = check.replace(" ", "");

        for (int i = check.length()-1; i >=0 ; i--) {

            reverse += check.charAt(i);

        }

        return check.equals(reverse);



    }
}
