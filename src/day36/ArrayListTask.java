package day36;

import java.util.ArrayList;

public class ArrayListTask {

    public static void main(String[] args) {


        ArrayList<Long> bla = new ArrayList<>();

        bla.add(12L);
        bla.add(100L);
        bla.add(150L);
        bla.add(200L);



        long sum = 0;

        for (int x = 0; x < bla.size() ; x++) {

            sum += bla.get(x);

        }

        System.out.println(sum);

    }
}
