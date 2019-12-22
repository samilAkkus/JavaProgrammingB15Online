package day06;

public class UsingTheValurOfOtherVariable {

    public static void main(String[] args) {


        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;



        System.out.println(" my favorite number " + myFavoriteNumber );

        System.out.println(" your favorite number " + yourFavoriteNumber);

         yourFavoriteNumber = 100;



        System.out.println(" my favorite number " + myFavoriteNumber );

        System.out.println(" your favorite number " + yourFavoriteNumber);










    }
}
