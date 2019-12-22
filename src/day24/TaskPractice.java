package day24;

import java.util.Arrays;

public class TaskPractice {

    public static void main(String[] args) {


        double[] prices = { 3.4,1.8,44.1};

        String pricesString = Arrays.toString(prices);

        for (int x = 0; x <pricesString.length() ; x++) {

            System.out.println("character at index "+x+"is :"+pricesString.charAt(x));

        }

    }
}
