package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        ////count 1 to 5;

        //do{
            //take some action here and repeat it
        //} while(some condition is true);

        int x = 1 ;

        do{
            System.out.println(x);
            ++x;
        }while (x<=5);

        int y = 5;

        do{
            System.out.println(y);
            --y;
        }while (y>0);
    }
}
