package a_replit;

import java.util.Scanner;

public class StringNoEnd_072 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        String txtWithoutLast = txt.substring(0,txt.length()-1);

        System.out.println(txtWithoutLast);

    }
}
