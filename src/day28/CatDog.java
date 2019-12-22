package day28;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for(countOfCats=0; countOfCats == countOfDogs; countOfCats++){

            if (word.contains("catdog")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

        }





    }
}
