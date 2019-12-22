package a_replit;

public class PrintLettersCombinations_105 {

    public static void main(String[] args) {


        String sentence = "zyxwv";

        for (int x = 0; x <sentence.length() ; x++) {


            for (int y = 0; y <sentence.length() ; y++) {

                System.out.println(""+sentence.charAt(x)+sentence.charAt(y));

            }

        }
    }
}
