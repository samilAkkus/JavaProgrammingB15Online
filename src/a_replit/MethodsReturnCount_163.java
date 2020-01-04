package a_replit;

public class MethodsReturnCount_163 {

    public static void main(String[] args) {



    }

    public static int  count_appearance(String[] arr,String t) {

        int count = 0;

        for (String s : arr) {

            if(s.equals(t)){

                ++count;
            }

        }


        return count;

    }
}
