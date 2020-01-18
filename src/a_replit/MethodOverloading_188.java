package a_replit;

public class MethodOverloading_188 {

    public static void main(String[] args) {

        System.out.println(findMax(new int[]{3,4,5,6,7}));
        System.out.println(findMax(new double[]{23.21,15.67,46.45}));

    }

    public static int findMax(int[] numbers){

        int maxi = numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if(numbers[i] > maxi){

                maxi = numbers[i];
            }

        }

        return maxi;


    }

    public static double findMax(double[] numbers){

        double maxi = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {

            if(numbers[i] > maxi){

                maxi = numbers[i];
            }

        }

        return maxi;



    }
}
