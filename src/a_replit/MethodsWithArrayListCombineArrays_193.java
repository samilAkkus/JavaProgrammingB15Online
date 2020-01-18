package a_replit;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MethodsWithArrayListCombineArrays_193 {

    public static void main(String[] args) {

        System.out.println(combineRs(new String[]{"f","o","o"},new String[]{"b","a","r"}));



    }
    public static String combineRs(String[] r1,String[] r2){

        String last = "";

        ArrayList<String> myList = new ArrayList<>(Arrays.asList(r1));

        myList.addAll(Arrays.asList(r2));

        for (int i = 0; i < myList.size() ; i++) {

            last += myList.get(i);

        }


//        String last = "";
//
//        for (int i = 0; i < r1.length ; i++) {
//
//            last += ""+ r1[i];
//
//        }
//
//        for (int i = 0; i < r2.length ; i++) {
//
//            last += ""+ r2[i];
//
//        }

        return last;

    }
}
