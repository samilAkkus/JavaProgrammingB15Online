package day16;

import java.util.Scanner;

public class GetSecondWord_CodeNote10 {

    public static void main(String[] args) {

        Scanner bla = new Scanner(System.in);

        System.out.println("Please enter 3 words");

        String sentence = bla.nextLine();

        String secondOne;

        secondOne = sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" "));

        System.out.println(secondOne);

        //first word is starting from 0 to first space////

        String firstOne;

        firstOne = sentence.substring(0,sentence.indexOf(" "));

        System.out.println(firstOne);


    }
}
