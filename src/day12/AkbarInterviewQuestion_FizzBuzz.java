package day12;

public class AkbarInterviewQuestion_FizzBuzz {
    public static void main(String[] args) {

        //create a class called FizzBuzzNumberCheck with main method
        //given a number
        //if this number can be divided by 5 without remainder lets print it Fizz number
        //if this number can be divided by 3 without remainder lets print it Buzz number
        //if this number can be divided by both 3 and 5 without remainder lets print it FizzBuzz number

        int num = 5;

        if(num%5==0 && num%3==0){
            System.out.println("FizzBuzz");
        }else{
            if(num%3==0){
                System.out.println("Buzz number");
            }else{
                if(num%5==0){
                    System.out.println("Fizz number");
                }else{
                    System.out.println("Not my number");
                }
            }
        }
    }
}
