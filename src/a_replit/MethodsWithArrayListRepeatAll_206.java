package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListRepeatAll_206 {

    public static void main(String[] args) {

        repeatAL(new ArrayList<>(Arrays.asList(true , false , false)));

    }

    public static void repeatAL(ArrayList<Boolean> listOfBoolean){

        listOfBoolean.addAll(listOfBoolean);




    }
}
