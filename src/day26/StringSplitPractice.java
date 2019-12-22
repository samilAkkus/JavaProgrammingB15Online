package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {


        String students = "Aboos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";

        students = students.replace(" ", "");

        String[] namesArray = students.split(",");

        System.out.println(Arrays.toString(namesArray));

        for (int x = 0; x < namesArray.length ; x++) {

            for (int y = 0; y < namesArray[x].length() ; y++) {

                System.out.print(namesArray[x].charAt(y)+"-");

            }
            System.out.println();

        }

    }
}
