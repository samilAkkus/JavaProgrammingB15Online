package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {



        // create 3 String variable for first name last name, company

        // create another variable for email

        // create email in this format firstName_lastName@company.com

        // print out the result as, my name is <your full name> and i work for
        // <company> and my email is <email>

        Scanner bla = new Scanner(System.in);

        System.out.println(" whats your name ");

        String firstName = bla.next();

        System.out.println(" whats your last name ");

        String lastName = bla.next();

        System.out.println(" whats your company ");

        String company = bla.next();

        String email = firstName+"_"+lastName+"@"+company;


        System.out.println(" my name is " + firstName + lastName + " and i work for " +
                company + " and my email is " + email + ".com");


    }
}
