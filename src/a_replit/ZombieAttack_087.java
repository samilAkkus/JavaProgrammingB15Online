package a_replit;

import java.util.Scanner;

public class ZombieAttack_087 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int day = 0 ; 0 <= inhabitants ; day++ ) {



            System.out.println("Day " + day + " " + "[" + inhabitants + "]");
            inhabitants = inhabitants / 2;

            if(inhabitants == 0){

                System.out.println("Day " + ++day + " " + "[" + inhabitants + "]");

                break;
            }



        }

        System.out.println("---- EXTINCT ----");
    }
}
