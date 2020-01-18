package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArrayListRemoveAll_199 {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

        removeAll(wordList,"hi");

        System.out.println(wordList);

    }

    public static void removeAll(ArrayList<String> wordList , String targetWord){

       wordList.removeAll(Arrays.asList(targetWord));


    }
}
