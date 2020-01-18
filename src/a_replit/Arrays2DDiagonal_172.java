package a_replit;

import java.util.Scanner;

public class Arrays2DDiagonal_172 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;

        int leftToRight = matrix[0][0]+matrix[1][1]+matrix[2][2];

        int rightToLeft = matrix[0][2]+matrix[1][1]+matrix[2][0];

        result = leftToRight - rightToLeft;

        System.out.println(Math.abs(result));



    }
}
