package day17;

public class TestName {
    public static void main(String[] args) {

        //u dont know length of your name
        //write a program to print your name reverse

        String name = "Samil";

        int x = name.length()-1;

        while(x>=0){

            System.out.print(name.charAt(x));
            --x;
        }

    }
}
