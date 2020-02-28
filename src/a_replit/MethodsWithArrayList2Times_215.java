package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList2Times_215 {

    public static void main(String[] args) {

        System.out.println(twoTimes(new ArrayList<>(Arrays.asList(1,3,5,7))));

    }

    public static ArrayList<Integer> twoTimes (ArrayList<Integer> param){

        ArrayList<Integer> param1 = new ArrayList<>(param);

        ArrayList<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < param.size() ; i++) {

            finalList.add(param.get(i));
            finalList.add(param1.get(i));


        }

        return finalList;


    }
}
