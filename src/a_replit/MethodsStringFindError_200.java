package a_replit;

public class MethodsStringFindError_200 {

    public static void main(String[] args) {

        System.out.println(isError("foo bar"));
        System.out.println(isError("error one two"));



    }


    public static boolean isError(String line){


        return line.startsWith("error");



    }
}
