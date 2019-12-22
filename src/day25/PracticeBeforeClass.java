package day25;

import java.util.Arrays;

public class PracticeBeforeClass {
    public static void main(String[] args) {


        int[] numbers = new int[3];

        numbers[0] = 2;
        numbers[1] = 5;
        numbers[2] = 7;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("------------------------");

        int[] scores = new int[4];

        scores[0] = 12;
        scores[1] = 24;
        scores[2] = 36;
        scores[3] = 48;

        for (int x = 0; x <scores.length ; x++) {

            System.out.println(scores[x]);

        }

        System.out.println("-------------------------");


        int[] bla = new int[]{23,12,34,12};

        for (int y = 0; y <bla.length ; y++) {

            System.out.println(bla[y]);

        }

        System.out.println("---------------------------");

        int[] blabla = {22,11,33,44};

        for (int z = 0; z <blabla.length ; z++) {

            System.out.println(blabla[z]);

        }

        System.out.println("============================");

        //FOR EACH

        int[] jerseyNumbers = {1,3,4,45,55,88};

        for (int jerseyNumber : jerseyNumbers) {

            if(jerseyNumber < 45){

                continue;
            }

            System.out.println(jerseyNumber);



        }

        System.out.println("====================");

        long[] nums = {10,40,20};

        for (int k = 0; k <nums.length ; k++) {

            System.out.println(nums[k]);

            nums[k] *= 2;



        }
        for (int l = 0; l <nums.length ; l++) {

            System.out.println(nums[l]);

        }

        for (long num : nums) {
            System.out.println(num);

        }

        System.out.println("==================");

        String[] superheros = {"Batman", "Superman", "Joker","Octopus"};


        System.out.println("BEFORE: "+ Arrays.toString(superheros));

        Arrays.sort(superheros);

        System.out.println("AFTER: "+Arrays.toString(superheros));

        System.out.println("==============================");

        int[] numberJersey = {12,34,100,99,9};

        Arrays.sort(numberJersey);

        System.out.println(Arrays.toString(numberJersey));

        System.out.println("===========================");

        String[] yarakKurek = {"Abbas","Anan","01","9","Zek"," ","amcik"};

        System.out.println(yarakKurek[0]);

        Arrays.sort(yarakKurek);



        System.out.println(yarakKurek);



        System.out.println(Arrays.toString(yarakKurek));

        System.out.println("===========================");


        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores4 = {6, 5, 6, 7, 3, 2, 34};

        System.out.println(Arrays.equals(scores1,scores2));
        System.out.println(Arrays.equals(scores3,scores4));
        System.out.println(Arrays.equals(scores1,scores3));

        int[] prices = {23,12,45,12};

        int max = prices[0];
        int min = prices[0];

        for (int v = 0; v <prices.length ; v++) {

            if(prices[v] > max){

                max = prices[v];
            }
            if(prices[v] < min){

                min = prices[v];
            }



        }
        System.out.println(max);

        System.out.println(min);






    }
}
