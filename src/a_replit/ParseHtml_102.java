package a_replit;

import java.util.Scanner;

public class ParseHtml_102 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if(html.contains("<html>")){

            int last = html.indexOf("id=\"")+4;

            System.out.println(html.substring(html.indexOf("id=\"")+4 , html.indexOf("\"", last )));
        }else {

            System.out.println("Invalid input!");
        }
    }
}
