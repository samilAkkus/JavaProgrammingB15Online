package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListAddIndex_197 {

    public static void main(String[] args) {

        ArrayList<String> bla = new ArrayList<>(Arrays.asList("amcik" , "gotveren" , "sikik" , "pickurusu"));

        test(bla);

        System.out.println(bla);

    }

    public static void test(ArrayList<String> words) {


        words.add(0,"hey");
        words.add(3,"yo");



    }
}
