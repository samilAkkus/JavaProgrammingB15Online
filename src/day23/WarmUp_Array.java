package day23;

public class WarmUp_Array {

    public static void main(String[] args) {


        //create an int array of 7 items
        //assign values
        //1, print out in reverse order
        //2, store last item in variable called lastItem
        ////////////////////print it out separately
        //3, print the item right in the middle
        //4, find sum, find max, find min , find average

//        int[] numbers = new int[7];
//
//        numbers[0] = 3;
//        numbers[1] = 11;
//        numbers[2] = 79;
//        numbers[3] = 13;
//        numbers[4] = 23;
//        numbers[5] = 4;
//        numbers[6] = 12;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[6]);

        int[] numbers = new int[]{3,11,79,13,23,4,12};

        int lastItem = numbers[numbers.length-1];

        System.out.println(lastItem);

        int middle = numbers[numbers.length / 2];

        System.out.println(middle);

        int sum = 0;

        for (int v = 0; v < numbers.length ; v++) {

            int currentItem = numbers[v];

            sum = sum + currentItem;

        }
        System.out.println("sum is"+sum);

        for (int x = 0; x <numbers.length ; x++) {

            System.out.println(numbers[x]);

        }





        for (int y = numbers.length-1; y >=0 ; y--) {

            System.out.println(numbers[y]);

        }



    }
}
