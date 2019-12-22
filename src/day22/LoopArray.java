package day22;

public class LoopArray {

    public static void main(String[] args) {

        int[] scores = new int[4];
        // assigning value to each index






        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
//
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);

        //HOW DO WE GET THE SIZE OF ANY ARRAY OBJECT
        ///ARRAY OBJECT HAS A PROPERTY CALLED LENGTH

            int itemCount = scores.length ; //this takes 4 from [4] ---on line 7---

        for (int x = 0; x <itemCount ; x++) {

            System.out.println(scores[x]);

        }

        for (int c = itemCount-1; c >=0 ; c--) {

            System.out.println(scores[c]);

        }

    }
}
