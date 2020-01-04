package day35;

public class GroceryExample {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3.14 each";

        int count = Integer.parseInt(sentence.split(" ")[2]);

        double price = Double.parseDouble(sentence.split(" ")[(sentence.split(" ").length)-2]);


        double finalResult = count * price;

        System.out.println(finalResult);

    }
}
