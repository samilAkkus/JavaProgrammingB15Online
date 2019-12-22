package day16;

import java.util.Scanner;

public class WakeUpTask1_ReversingWord {

    public static void main(String[] args) {


        //given a work with 4 character store in a String variable word1
        //create a String variable called word2
        //store the reversed word1 into word2
        //and print out
        //word1---java word2 avaJ
        //optionally scanner

        Scanner bla = new Scanner(System.in);

        System.out.println("Enter a 4 character word please!");

        String word1 = bla.next();

        String word2 = "";

        word2 = "Reversed answer is: "+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
//
//        word2 = word2 + word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

//        word2 += "" +word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);



        System.out.println(word2);
    }
}
