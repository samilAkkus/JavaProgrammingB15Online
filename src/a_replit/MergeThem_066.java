package a_replit;

import java.util.Scanner;

public class MergeThem_066 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        char wordOneFirst = word1.charAt(0);

        char wordOneLast = word1.charAt(word1.length()-1);

        if(word1.length() == 3 && word2.length() == 3){

            System.out.println(""+ wordOneFirst+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+
                    wordOneLast+word2.charAt(2));

        }else {

            System.out.println("cannot merge");
        }




    }
}
