package day20;

public class ReversingAString {

    public static void main(String[] args) {


        // give String name with value
        // reverse it and store it into another String variable reversedName
                    // 01234567
        String name = "Jon Snow";

        String reversedName = "";


        for (int x = 7; x >=0 ; x--) {

            System.out.print(x);

            System.out.println(name.charAt(x));

            reversedName = reversedName + name.charAt(x);

        }
        System.out.println(reversedName);
    }
}
