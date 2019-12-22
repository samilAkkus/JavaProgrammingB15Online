package day20;

public class PalindromeTest {

    public static void main(String[] args) {


        // level, kayak, elle, madam,
        // if u reverse a String if it does not change it means its PALINDROME

        String name = "kayak";

        System.out.println("name = " + name);

        String reversedName = "";


        for (int x = name.length()-1; x >=0 ; x--) {

            reversedName = reversedName + name.charAt(x);


        }

        System.out.println("reversedName = " + reversedName);

        //check whether reversed name is equal without case checking

        if(name.equalsIgnoreCase(reversedName))  {

            System.out.println("palindrome test has passed");
        }else{

            System.out.println("palindrome test has failed");
        }

        //make this code does not care about spaces while checking




    }
}
