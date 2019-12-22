package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        // checking for String equality should be always done by
        // using  equals method of the String
        // oneString.equals(anotherString)----true//false
        //equals method coming from String class
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equal method

        System.out.println( "java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println(myStr.equals(yourStr));



    }
}
