package a_replit;

import java.util.Scanner;

public class ConditionalStatementPractice3_048 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();

        if(name.equals("Chen")){
            System.out.println("teacher");
        }else{
            if(!name.equals("Chen")){
                System.out.println("student");
            }
        }
    }
}
