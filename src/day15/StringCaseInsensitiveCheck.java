package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {


        String name = "Arya Stark";

        System.out.println(name.contains("st"));

        //i wanna check whether this name contains st no matter the case
        //so i want to store the uppercase version of this name then check for ST

        String upperCaseName = name.toUpperCase(); // "ARYA STARK"

        System.out.println("name contains ST or not " + upperCaseName.contains("ST"));
        // this is the only way to ignore case sensitivity

        String lowerCaseName = name.toLowerCase();

        System.out.println("name contains st or not "+ lowerCaseName.contains("st"));

        ///////////////////////////////////////////////////////////////////////////////

        //this is called chaining, combining multiple method call
        // make my name all lowercase(String) then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
    }
}
