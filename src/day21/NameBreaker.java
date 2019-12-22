package day21;

public class NameBreaker {

    public static void main(String[] args) {


        //store your name into String
        //loop through each and every letters
        //and print
        //if you see letter b -->> get out of the loop

        String name = "Samil";

        for (int i = 0; i <=name.length()-1 ; i++) {

            if(name.substring(i,i+1).equals("a")){

                break;
            }
            System.out.println(name.substring(i,i+1));

        }

        System.out.println("===========================");

        for (int x = 0; x <= name.length() ; x++) {

            char currentChar = name.charAt(x);

            if(currentChar == 'l' || currentChar == 'L'){

                break;
            }
            System.out.println(currentChar);

        }

    }
}
