package day17;

public class LateNightPractice_FizzBuzz {

    public static void main(String[] args) {


        int x = 100;

        while(x >= 0){

            if(x % 5 == 0 && x % 3 == 0){

                System.out.println(x + "is fizzbuzz amk");
            }else{
                if(x % 5 == 0){
                    System.out.println(x+ "is just fizz amk");
                }else {
                    if(x % 3 == 0){
                        System.out.println(x+ "is just buzz amk");
                    }
                }
            }
            --x;
        }
    }
}
