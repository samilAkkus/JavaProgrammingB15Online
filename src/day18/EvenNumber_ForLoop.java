package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {


        for( int x = 0; x<=100 ; x+=2 ){

            System.out.println(x + " is even number");
        }

        for( int y = 0; y<100 ; y+=3){

            System.out.println(y);
        }

        for (int z = 51; z < 100 ; z++) {

            if( z % 2 == 0){
                System.out.println(z + " is even number after 51");
            }

        }

        for (int i = 0; i < 100 ; i++) {

            if( i % 5 ==0 && i % 3 == 0){

                System.out.println("i = " + i);
            }

        }

    }
}
