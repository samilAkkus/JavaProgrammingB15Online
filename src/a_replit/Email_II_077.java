package a_replit;

import java.util.Scanner;

public class Email_II_077 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_"));
        String firstCorrect = firstName.toUpperCase().charAt(0)+ firstName.substring(1);

        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String lastCorrect = lastName.toUpperCase().charAt(0) + lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1 , email.indexOf("."));

        String topLevelDomain = email.substring(email.indexOf(".")+1);

        System.out.println("First name : "+firstCorrect);
        System.out.println("Last name : "+lastCorrect);
        System.out.println("Domain : "+domain);
        System.out.println("Top-Level Domain : "+topLevelDomain);



    }
}
