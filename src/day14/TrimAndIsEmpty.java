package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = " REPL IS COMING !";

        System.out.println(message);

        System.out.println("message character count is "+ message.length());

        // i wanna take the space out

        System.out.println(message.trim());

        message = message.trim(); // to trim and take spaces out!!!!,,it takes spaces from two sides not in between

        System.out.println("message character count is "+ message.length());

        //isEmpty

        System.out.println(message.isEmpty());


    }
}
