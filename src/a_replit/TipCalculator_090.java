package a_replit;

import java.util.Scanner;

public class TipCalculator_090 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Split:");
        String split=scan.nextLine();
        System.out.println("Number of people:");
        int people=scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        String qualityOfService=scan.next();

        System.out.print("Number of people entered: ");
        for(int i=0;i<people;i++){
            System.out.print("&");
        }
        System.out.println();
        double totalTip=(checkAmount*serviceQuality(qualityOfService))/100;
        double totalPay=totalTip+checkAmount;
        double tipPerPerson=totalTip/people;
        double totalPerPerson=totalPay/people;

        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);




    }
    public static int serviceQuality(String quality){
        if(quality.equals("Poor"))
            return 5;
        if(quality.equals("Fair"))
            return 10;
        if(quality.equals("Good"))
            return 15;
        if(quality.equals("Great"))
            return 20;
        if(quality.equals("Excellent"))
            return 25;
        return 0;

    }
}
