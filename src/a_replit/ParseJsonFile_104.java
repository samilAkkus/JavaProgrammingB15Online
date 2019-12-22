package a_replit;

import java.util.Scanner;

public class ParseJsonFile_104 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int fStart;
        int fFinish;
        int lStart ;
        int lFinish;


        json = json.replace(" " , "");

        fStart = json.indexOf("firstName")+12;
        fFinish = json.indexOf("\",\"lastName");



        lStart = json.indexOf("lastName")+11;
        lFinish = json.indexOf("\",\"role");




        System.out.println("First name: "+json.substring(fStart , fFinish));

        System.out.println("Last name: "+json.substring(lStart , lFinish));
    }
}
