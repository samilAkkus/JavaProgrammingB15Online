package a_replit;

import java.util.Scanner;

public class ArraysPrintShortestWord_125 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest = str[0];

        for (int x = 1; x <str.length ; x++) {

            if(str[x].length() < shortest.length()){


                shortest = str[x];
            }

        }
        System.out.println(shortest);
    }
}
