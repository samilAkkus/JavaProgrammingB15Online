package day15;

public class ReplaceMethod {
    public static void main(String[] args) {


        String message = "I love Pumpkin, Pumpkin is fun!";

        message = message.replace("Pumpkin","Java");

        System.out.println(message);

        String message2 = "Happy Thanks Giving to All";

        message2 = message2.replace("Thanks Giving","Thanksgiving");

        System.out.println(message2);

        message2 = message2.replace(" ","");
        System.out.println(message2);

        String message3 = "tomorrow is off no!";

        message3 = message3.replace("no","");

        System.out.println(message3);







    }
}
