package day15;

public class SubString_RingofTheLord {

    public static void main(String[] args) {


        //task
        //you know index already
        //String movie = "Lord Of The Ring"
        //reverse it as----> Ring Of The Lord

        String movie = "Lord Of The Ring";

        String wordLord = movie.substring(0,4);

        String wordOf = movie.substring(5,7);

        String wordThe = movie.substring(8,11);

        String wordRing = movie.substring(12,16);

        System.out.println(wordRing+" "+wordOf+" "+wordThe+" "+wordLord);

        //---> turn it Ring Of The Java Lord

        System.out.println(wordRing+" "+wordOf+" "+wordThe+" Java "+wordLord);
    }
}
