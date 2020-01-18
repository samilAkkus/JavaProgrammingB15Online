package a_replit;

public class MethodsWithStringExactNumber_209 {

    public static void main(String[] args) {

        System.out.println(exactNum("aa2aa3"));

    }

    public static String exactNum(String s){

        String nums = "";

        for (int i = 0; i < s.length() ; i++) {

            if(Character.isDigit(s.charAt(i))){


                nums += s.charAt(i);
            }

        }

        return nums;




    }
}



