package day15;

public class ReversingAString {
    public static void main(String[] args) {


        String name = "Akbar";

        System.out.println(name.charAt(0) + " " + name.charAt(1)+ " "
                + name.charAt(2)+ " " + name.charAt(3)+ " " + name.charAt(4));

        System.out.println(name.charAt(4) + " " + name.charAt(3)+ " "
                + name.charAt(2)+ " " + name.charAt(1)+ " " + name.charAt(0));

        //how do u find out last character of any string
        //counting character start with one
        //counting index starts with 0
        //so last character index will be always one less than actual character count

        System.out.println(name.charAt(name.length()-1));
    }
}
