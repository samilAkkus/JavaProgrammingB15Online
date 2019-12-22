package a_replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ZombieAttack1_127 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();


        }

        for (int x = 0; 0 <= inhabitants.length ; x++) {

            System.out.println("Day "+x+" "+ Arrays.toString(inhabitants));

            inhabitants[0] = inhabitants[0] / 2;
            inhabitants[1] = inhabitants[1] / 2;
            inhabitants[2] = inhabitants[2] / 2;
            inhabitants[3] = inhabitants[3] / 2;
            inhabitants[4] = inhabitants[4] / 2;
            inhabitants[5] = inhabitants[5] / 2;
            inhabitants[6] = inhabitants[6] / 2;
            inhabitants[7] = inhabitants[7] / 2;

            if(inhabitants[0]==0 && inhabitants[1]==0 && inhabitants[2]==0 && inhabitants[3]==0 &&
                    inhabitants[4]==0 && inhabitants[5]==0 && inhabitants[6]==0 && inhabitants[7]==0 ){

                System.out.println("Day "+(++x)+" "+ Arrays.toString(inhabitants));

                break;
            }




        }
        System.out.println("---- EXTINCT ----");



    }
}
