package day11;

public class StringEqualityPractice_3 {
    public static void main(String[] args) {


        //update the last program to add more condition
        //using else if in the middle
        //check the value of myStr
        // if it is Java---correct word
        // if it is Cava ---pumpkin
        //else say not java nor pumpkin

        String myStr = new String("Cava");

        if (myStr.equals("Java")) {
            System.out.println("correct word");
        } else {
            if (myStr.equals("Cava")) {
                System.out.println("pumpkin");
            } else {
                System.out.println("not java or pumpkin");
            }
        }


    }
}
