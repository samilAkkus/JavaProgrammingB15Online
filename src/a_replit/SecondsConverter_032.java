package a_replit;

import java.util.Scanner;

public class SecondsConverter_032 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter seconds");

        int inputSeconds = s.nextInt();

        int hours;

        int minutes;

        int seconds;

        hours = inputSeconds/3600;

        minutes = (inputSeconds%3600)/60;

        seconds = (inputSeconds%3600)%60;

        System.out.println(hours+" hours, "+minutes+", and "+seconds+" seconds");




    }
}
