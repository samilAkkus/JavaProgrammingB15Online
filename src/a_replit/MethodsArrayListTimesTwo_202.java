package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class MethodsArrayListTimesTwo_202 {

    public static void main(String[] args) {

        timesTwo(new ArrayList<>(Arrays.asList(3,4,5,6,7)));


    }

    public static void timesTwo(ArrayList<Integer> nums){


        for (int i = 0; i < nums.size() ; i++) {

            nums.set(i,(nums.get(i) * 2));

        }

    }
}
