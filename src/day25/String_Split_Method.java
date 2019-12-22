package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {



        String sentence = "I Love Java";

        String[] allWords = sentence.split(" ");

        System.out.println(Arrays.toString(allWords));

        System.out.println(allWords[0]);

        System.out.println("how many word do i have: "+ allWords.length);

        System.out.println("last word of this sentence is "+ allWords[allWords.length-1]);



        String sentence2 = "Everything is Awesome";

        String [] cutParts = sentence2.split("e");

        System.out.println(Arrays.toString(cutParts));

        String[] isDalga = sentence2.split("is");

        System.out.println(Arrays.toString(isDalga));

        for (String s : isDalga) {

            System.out.println(s);

        }
    }
}
