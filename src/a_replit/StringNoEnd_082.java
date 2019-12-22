package a_replit;

import java.util.Scanner;

public class StringNoEnd_082 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0,txt.length()-1));
    }
}
