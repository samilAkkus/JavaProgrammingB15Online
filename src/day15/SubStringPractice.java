package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        //getting the part of the String out of another String
                      //0123456789012345
        String movie = "Lord Of The Ring";

        // I want to get the word <of> from this movie

        String wordOf = movie.substring(5,7);

        System.out.println(wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println(wordThe);

        //get from the second word till last word!

        //find out first space index, second word starts right after first space
        //so that is our starting point my end point is more than last index!!

        int startingPoint = movie.indexOf(" ") +1;

        int endingPoint = movie.length();

        System.out.println("second word till last:"+ movie.substring(startingPoint,endingPoint));

        String secondWordTillLast = movie.substring(5,16);

        System.out.println(secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println(wordLordOf);

        System.out.println(movie.substring(0)); // Lord Of The Ring

        System.out.println(movie.substring(1));





    }
}
