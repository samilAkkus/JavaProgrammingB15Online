package a_replit;

public class MethodsWithStringReverseLetters_210 {

    public static void main(String[] args) {

        System.out.println(reverseLetters("Ab,c,de!$"));

    }

    public static String reverseLetters(String word){

        String reverse = "";
        String finalOne = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            if(Character.isLetter(word.charAt(i))){

                reverse += word.charAt(i);
            }

        }

        int ok = 0;

        for (int i = 0; i < word.length() ; i++) {

            if(Character.isLetter(word.charAt(i))){

                finalOne += reverse.charAt(ok);

                ++ok;


            }else {

                finalOne += word.charAt(i);
            }

        }

        return finalOne;



    }
}

/*
For flipGrid what i get from sample videos are :

1-quick information about Agile with essential keywords
2-Agile team members, explain your team
3-Agile ceremonies( what do u mention about and who attends)


*
 */
