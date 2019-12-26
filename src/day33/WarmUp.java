package day33;

public class WarmUp {

    public static void main(String[] args) {

        getSpelledName("Samil");

        System.out.println(getSpelledName("Samil"));



    }


    public static String getSpelledName(String name){

       String result = "";

        for (int x = 0; x < name.length() ; x++) {

            result += name.charAt(x);  //+"-"

            if(x != name.length()-1){

                result += "-";
            }

        }

        //result = result.substring(0,result.lastIndexOf("-"));




        return result;
    }
}
