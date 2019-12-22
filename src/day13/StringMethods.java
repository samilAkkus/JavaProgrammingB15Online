package day13;

public class StringMethods {
    public static void main(String[] args) {


        //string actions we already know
        // equals
        String s1 = "Hello";
        System.out.println(s1.equals("acs"));

        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Hello"));
///////////////////////////////////////////////////////////////////////////////////////////
        //toUpperCase --- make characters uppercase

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s2 = "Samil ";

        System.out.println("MY NAME IS "+ s2.toUpperCase());
        System.out.println("my name is "+s2.toLowerCase());

        //in order to get how many character we have inside String
        //we can use length method of String

        System.out.println(s2.length());

        int lengthofs2 = s2.length();

        if(lengthofs2>4){

            System.out.println("more than 4 character");
        }else{
            System.out.println("less than 4 character");
        }


    }
}
