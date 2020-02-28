package a_replit;

import java.util.*;



public class MethodsWithArrayListBlogPostDB_216 {

    public static void main(String[] args) {

        ArrayList<String[]> r = new ArrayList<>();

        r.add(new String[]{"1","title","content1"});
        r.add(new String[]{"2","another title","content2"});
        r.add(new String[]{"3","yet another title","content3"});

        System.out.println(blogDb(new ArrayList<String[]>(r) , "1"));

    }


    public static String blogDb(ArrayList<String[]> r, String id)  {

        String stringReturn = "";

        for (int i = 0; i < r.size() ; i++) {

            if(r.get(i)[0].equals(id)){

                stringReturn += r.get(i)[1] + "\n" + r.get(i)[2];


            }

        }

        return stringReturn;





    }
}
