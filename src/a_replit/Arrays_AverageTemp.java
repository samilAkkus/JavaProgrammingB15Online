package a_replit;

import java.util.Scanner;

public class Arrays_AverageTemp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        k = temps.length;

        for (int x = 0; x < k ; x++) {

            total += temps[x];

        }

        avgTemp = total / k ;

        System.out.println(avgTemp);

    }
}
