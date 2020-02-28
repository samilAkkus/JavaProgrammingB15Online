package a_replit;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayListRemoveInstances_213 {

    public static void main(String[] args) {

        System.out.println(removeInst(new ArrayList<Integer>(Arrays.asList(1,1,2,3,1,4)) , 1));

    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n){

        r.removeAll(Arrays.asList(n));

        return r;




    }
}
