package a_replit;

import java.util.Scanner;

public class BurgerOrChicken_050 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        String in = s.next();

        float output12 = 10.0f;

        float output2 = 2.0f;

        if(in.equals("burger") || in.equals("chicken")){
            System.out.println(output12);
        }else {
            if(in.equals("soda")){
                System.out.println(output2);
            }else{

            }
        }
    }
}
