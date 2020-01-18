package a_replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodsWithStringAnagram_204 {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "Silent"));
        System.out.println(isAnagram("earth", "heart"));
        System.out.println(isAnagram("star", "rats"));
        System.out.println(isAnagram("hi", "bye"));
        System.out.println(isAnagram("java", "cava"));


    }

    public static boolean isAnagram(String word1, String word2){

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        String[] word1Array = word1.split("");

        ArrayList<String> word1ArrayList = new ArrayList<>(Arrays.asList(word1Array));

        Collections.sort(word1ArrayList);


        String[] word2Array = word2.split("");

        ArrayList<String> word2ArrayList = new ArrayList<>(Arrays.asList(word2Array));

        Collections.sort(word2ArrayList);

        return word1ArrayList.equals(word2ArrayList);




    }
}
