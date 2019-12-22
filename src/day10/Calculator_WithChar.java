package day10;

public class Calculator_WithChar {

    public static void main(String[] args) {

        // create a variable called operator with type char
        // assign the value for one of these 4= +-*/
        // char operator = '+';
        // use switch statement to do following logic

        // if the operator is + print you are about to add number
        // if the operator is - print you are about to subtract number
        // if the operator is * print you are about to multiply number
        // if the operator is / print you are about to divide number
        // if nothing matches print invalid operator

        //USE switch statement to complete this task

        char operator = '-';


        switch (operator) {
            case '+':
                System.out.println("you are about to add number");
                break;
            case '-':
                System.out.println("you are about to subtract number");
                break;
            case '*':
                System.out.println("you are about to multiply number");
                break;
            case '/':
                System.out.println("you are about to divide number");
                break;
            default:
                System.out.println("invalid");
                break;

        }


    }
}
