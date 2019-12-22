package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        //if a number can be divided by both 3 and 5 ------fizz buzz number
        //if a number can be divided by 5 ------fizz number
        //if a number can be divided by 3 ------buzz number

        int num = 12;

        if(num%3==0 && num%5==0){
            System.out.println("fizz buzz number");
        }else{
            if(num%5==0){
                System.out.println("fizz number");
            }else{
                if(num%3==0){
                    System.out.println("buzz number");
                }else{
                    System.out.println("invalid number");
                }
            }
        }



    }



}


