package day12;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {


        String myName = "Samil";

        boolean myNameCorrect = myName.equals("Samil");

        System.out.println(myNameCorrect);

        boolean myNameIgnoreCase = myName.equalsIgnoreCase("SaMIL");

        System.out.println(myNameIgnoreCase);


    }
}
