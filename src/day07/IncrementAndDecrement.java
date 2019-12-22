package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {


        int apple = 10;

        apple = apple + 1;

        apple += 1;
        System.out.println(apple);
        ++ apple;

        System.out.println(apple);

        -- apple;

        System.out.println(apple);

        System.out.println( ++apple ); // we can add ++ right in to ()

        System.out.println(" used ++ to increment and concatenate : " + (++apple) );








    }
}
