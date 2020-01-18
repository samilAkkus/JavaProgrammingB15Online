package a_replit;

public class MethodsWithStringWordCount_181 {




    public static void main(String[] args) {

        System.out.println(wordCount("foo bar"));



    }

    public static int wordCount(String words){

        int count = 0;

        for (int i = 0; i < words.length() ; i++) {

            if(words.charAt(i) == ' '){

                ++count;
            }

        }

        return count+1;


    }
}
