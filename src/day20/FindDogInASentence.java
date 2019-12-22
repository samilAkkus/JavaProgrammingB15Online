package day20;

public class FindDogInASentence {

    public static void main(String[] args) {


        //given a sentence, find out location of the dog

        //our approach is doing through the sentence 3 character at a time
        //then if 3 characters happen to be a dog, we print out the index


        String msg = "I like Dog, Dogs are cute , Dogs are friendly";

        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <= lastCharIndex-2 ; x++) {



            System.out.println(msg.substring(x,x+3));

            if(msg.substring(x,x+3).equals("Dog")){

                System.out.println("bingo!!!!! at-->>"+x);
            }

        }




    }
}
