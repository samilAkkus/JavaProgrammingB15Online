package a_replit;

public class MethodsWithStringMerge_178 {

    public static void main(String[] args) {

        System.out.println(mergeStrings("java","selenium"));

    }

    public static String mergeStrings(String one, String two) {

        String merge = "";

        if(one.length() == two.length()){

            for (int i = 0; i < one.length() ; i++) {

                merge += ""+ one.charAt(i)+ two.charAt(i);



            }
            return merge;
        }else {

            if(one.length() > two.length()){

                for (int i = 0; i < two.length() ; i++) {

                    merge += ""+ one.charAt(i)+ two.charAt(i);



                }
                return merge + one.substring(two.length());
            }
        }

        for (int i = 0; i < one.length() ; i++) {

            merge += ""+ one.charAt(i)+ two.charAt(i) ;

        }
        return merge + two.substring(one.length()) ;

    }
}
