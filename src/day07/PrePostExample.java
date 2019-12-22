package day07;

public class PrePostExample {

    public static void main(String[] args) {


        int score = 50;

        System.out.println( ++score ); //51

        System.out.println( score++ ); //51

        System.out.println( score ); //52

        System.out.println( --score ); //51

        System.out.println( score-- ); //51

        System.out.println(score); //50
    }
}
