package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListRemove_196 {

    public static void main(String[] args) {

        test(new ArrayList<>(Arrays.asList(3.12,4.12,5.67,12.1)));



    }

    public static void test(ArrayList<Double> dubs)
    {
        dubs.remove(0);
        dubs.remove(0);

        System.out.println(dubs);

    }


}
