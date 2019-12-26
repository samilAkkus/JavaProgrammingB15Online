package day33;

public class NumberAction {

    public static void main(String[] args) {



        System.out.println(getSumFrom1toX(5));

        System.out.println(getSumFrom1toX(2));

        int doubleIt = getSumFrom1toX(5) * 2;

        System.out.println(doubleIt);

    }

    public static int getSumFrom1toX(int x){

        int sum = 0;

        for (int i = 0; i <= x ; i++) {

            sum+=i;

        }

        return sum;

    }
}
