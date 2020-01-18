package a_replit;

import java.util.ArrayList;

public class MethodsWithArrayListCombineAll_198 {

    public static void main(String[] args) {

    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1 , ArrayList<String> wordList2 ){

        ArrayList<String> combine = new ArrayList<>();

        combine.addAll(wordList1);
        combine.addAll(wordList2);

        return combine;



    }
}
