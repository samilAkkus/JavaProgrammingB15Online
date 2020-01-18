package a_replit;

public class MethodsWithStringUnique_179 {

    public static void main(String[] args) {

        System.out.println(uniqueChars("spoon"));

    }

    public static String uniqueChars(String str){

        String unique = "";

        for (int i = 0; i < str.length()  ; i++) {

            if(!unique.contains(str.substring(i,i+1))){

                unique += str.substring(i,i+1);


            }

        }

        return unique;
    }
}
