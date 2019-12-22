package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {


        String sentence = "We are trying to find longestdsfsf word";

        String[] allWords = sentence.split(" ");

        Arrays.toString(allWords);



        String longestWord = "";


        for (String currentWord : allWords) {

            if(currentWord.length() > longestWord.length()){

                longestWord = currentWord;


            }

        }
        System.out.println(longestWord);

        System.out.println(longestWord.length());


    }
}
