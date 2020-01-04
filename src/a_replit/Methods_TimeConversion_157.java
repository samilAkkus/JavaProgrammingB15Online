package a_replit;

import java.util.Scanner;

public class Methods_TimeConversion_157 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }

    public static void timeConversion(String s) {

        if(s.equals("12:00:00AM")){

            System.out.println("00:00:00");
            return;
        }else {

            if(s.equals("12:00:00PM")){

                System.out.println("12:00:00");
                return;
            }
        }

        if(s.contains("A")){

            System.out.println(s.substring(0,s.indexOf("A")));
        }else {

            if(s.contains("P")){

                String[] containP = s.split(":");

                String first = containP[0];

                int firstInt = Integer.parseInt(first);

                firstInt += 12;


                s = firstInt + s.substring(s.indexOf(":"),s.indexOf("P"));

                System.out.println(s);

            }
        }





    }
}
