package day09;

public class LanguageSwitchStatement {

    public static void main(String[] args) {


        int languageCode = 2;

        String greeting = "";

        switch (languageCode){

            case 1 :
                greeting = " hello ";
            break;

            case 2 :
                greeting = " hi ";
                break;

            case 3 :
                greeting = " hoy ";
                break;

            case 4 :
                greeting = " hay ";
                break;

            case 5 :
                greeting = " hey ";
                break;
            default:
                greeting = " unknown ";
                break;

        }
        System.out.println(" ur selection is " + greeting);
    }
}
