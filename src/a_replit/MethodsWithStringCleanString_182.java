package a_replit;

public class MethodsWithStringCleanString_182 {

    public static void main(String[] args) {

        System.out.println(clean("one two three","two"));

    }

    public static String clean (String text ,String badWord){

        String[] split = text.split(" ");

        String last ="";

        for (int i = 0; i < split.length ; i++) {

            if(!(split[i].equals(badWord))){

                last += split[i] + " ";
            }

        }

        last = last.trim();

        return last;

    }
}
