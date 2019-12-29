package day35;

public class IntegerPractice {

    public static void main(String[] args) {

        String twoNumbers = "100,600";

        int num1 = Integer.parseInt(twoNumbers.split(",")[0]);

        int num2 = Integer.parseInt(twoNumbers.split(",")[1]);

        System.out.println(num1+num2);

        int bla = 5;

        String blaStr = String.valueOf(bla);

        System.out.println(blaStr);





    }
}
