package a_replit;

import java.util.Scanner;

public class EqualsJavaPython_101 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaCount = 0;
        int pythonCount = 0;

        for (int x = 0; x <= sentence.length()-4 ; x++) {

            if(sentence.substring(x,x+4).equals("java")){

                ++javaCount;


            }

        }

        for (int y = 0; y <=sentence.length()-6 ; y++) {

            if(sentence.substring(y,y+6).equals("python")){

                ++pythonCount;
            }

        }

        if(javaCount == pythonCount){

            System.out.println(true);
        }else {

            System.out.println(false);
        }

    }
}
