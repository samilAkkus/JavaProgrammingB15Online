package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        //password
        //minimum 8 char, max 16 char
        //it must contain _ or $
        //it must not contain space
        //it must start with Ab

        // if any of above condition doesnt match say; invalid password
        //else ,, good password

        String password = "ASdsdsd123213";

        //minimum 8 char, max 16 char
        //password.length() >=8 && password.length()<=16;
        boolean min8max16 = password.length() >=8 && password.length()<=16;

        //it must contain _ or $
        //password.contains("_" || "$")
        boolean mustContains_$ =  password.contains("_") || password.contains("$");

        //it must not contain space
          //! password.contains(" ")
        boolean mustNotContainSpace = ! password.contains(" ");


        //it must start with Ab
        //password.startsWith("Ab")
        boolean mustStartWith = password.startsWith("Ab");



        if(min8max16 && mustContains_$ && mustNotContainSpace && mustStartWith){
            System.out.println("VALID PASSWORD");
        }else {
            System.out.println("INVALID PASSWORD");
        }
    }
}
