package day11;

public class StringEqualityPractice_2Condition {
    public static void main(String[] args) {

        // create a program to check whether myStr value is Java
        //if true---correct word
        //if false---say JAVA

        String yourStr = new String("Java");

        String myStr = "Java";
        if(myStr.equals("Java")){ // "Java" could be yourStr
            System.out.println("CORRECT WORD");
        }else{
            System.out.println("SAY JAVAAAAA");
        }
    }
}
