package day10;

public class WarmUpTask1_Answer {

    public static void main(String[] args) {


        // create a variable called myAnswer as String with value of empty string
        // create a variable called myNumber and assign any value

        // if the number can be divided by 5 without remainder
        // assign myAnswer value to Fizz Number
        // if not assign the value to not a fizz number

        // outside if else statement: // for example
        // print my number is <>, it is <value of myAnswer here>

        String myAnswer = "";

        int myNumber = 30;

        if(myNumber%5==0){

            myAnswer = "fizz number";
        }else {

            myAnswer = "not a fizz number";
        }

        System.out.println(" my number is " + myNumber + " and it is "+ myAnswer);




    }
}
