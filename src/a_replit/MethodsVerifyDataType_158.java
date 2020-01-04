package a_replit;

import java.util.Scanner;

public class MethodsVerifyDataType_158 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String numStr = scan.next();
        printDataTypes(numStr);

    }

    public static void printDataTypes(String numStr){
        long num = 0;
        try{
            num = Long.valueOf(numStr);
            System.out.println(num+" can be fitted in:");
            if(num>=-128 && num<=127){
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                return;
            }
            //WRITE YOUR CODE HERE

            if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE ){

                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                return;

            }

            if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){

                System.out.println("* int");
                System.out.println("* long");

                return;


            }

            if(num >= Long.MIN_VALUE && num<= Long.MAX_VALUE ){

                System.out.println("* long");
                return;
            }



            //DO NOT CHANGE
        }catch(Exception e){
            System.out.println(numStr+" can't be fitted anywhere.");
        }
    }


}
