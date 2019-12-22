package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {


        //what do u do in each season

        // spring hike, easter, newruz , blossom
        // summer-- swim, vacation, bbq , holiday
        // fall-- black friday, hiking, harvest, shopping
        // winter-- snow boarding, ski, christmas, new year

        Scanner scan = new Scanner(System.in);

        System.out.println("whats the season");

        String season = scan.next();

        switch (season){
            case "spring":
                System.out.println("hike, easter, newruz , blossom");
                break;
            case "summer":
                System.out.println("swim, vacation, bbq , holiday");
                break;
            case "fall":
                System.out.println("black friday, hiking, harvest, shopping");
                break;
            case "winter":
                System.out.println("snow boarding, ski, christmas, new year");
                break;
            default:
                break;

        }


    }
}
