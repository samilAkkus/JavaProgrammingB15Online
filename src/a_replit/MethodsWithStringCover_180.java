package a_replit;

public class MethodsWithStringCover_180 {

    public static void main(String[] args) {

        System.out.println(coverString("Certified Wooden Spoon", "o") ) ;

    }

    public static String coverString(String main, String coverME){

        if(main.contains(coverME)){

            main = main.replaceAll(coverME,"["+coverME+"]");

            return main;
        }

        main = "["+main+"]";
        return main;


    }
}
