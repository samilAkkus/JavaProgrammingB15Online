package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListSizeGet_195 {

    public static void main(String[] args) {

        System.out.println(sum(new ArrayList<>(Arrays.asList(1,2,3,4,5))));



    }
    public static int sum(ArrayList<Integer> ints)
    {
        int sum = 0;

        for (int i = 0; i < ints.size() ; i++) {

            sum += ints.get(i);

        }

        return sum;

    }


}
