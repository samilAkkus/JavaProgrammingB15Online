package a_replit;
import java.util.*;

public class MethodsWithArrayListSearch_214 {

    public static void main(String[] args) {

        System.out.println(search(new ArrayList<String>(Arrays.asList("one apple","two orange",
                "four banana")) , "yarrak"));

    }


    public static String search(ArrayList<String> r, String find){

        for (int i = 0; i < r.size() ; i++) {

            if(r.get(i).contains(find)){

                return r.get(i);
            }

        }

        return "search failed";



    }
}
