package a_replit;

import java.util.Scanner;

public class ConditionalStatementPractice2_047 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if(num%2==1){
            System.out.println(num+" is odd");
        }else{
            if(num%2==0){
                System.out.println(num+" is even");
            }
        }
    }
}
