package day06;

public class CompoundOperator3 {

    public static void main(String[] args) {

        int bankBalance = 1140;

        bankBalance /= 2;

        System.out.println(bankBalance);

        int remainder = bankBalance%500;

        System.out.println(remainder);


        bankBalance %= 500;

        System.out.println(bankBalance);
    }
}
