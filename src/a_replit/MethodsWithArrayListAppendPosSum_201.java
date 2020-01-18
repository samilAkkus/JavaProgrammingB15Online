package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListAppendPosSum_201 {

    public static void main(String[] args) {

        System.out.println(appendPosSum(new ArrayList<Integer> (Arrays.asList(4,-6,3,-8,0,4,3))));


    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num){

        ArrayList<Integer> bla = new ArrayList<>();

        Integer i1 = 0;

        for (int i = 0; i < num.size() ; i++) {

            if(num.get(i) > 0){

                bla.add(num.get(i));

                i1 += num.get(i);
            }

        }

        bla.add(i1);

        return bla;



    }
}
