package a_replit;

import java.util.Arrays;

public class Arrays2DChessBoard_171 {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        String letters = "abcdefgh";

        for (int i = 0; i < chessBoard.length ; i++) {

            for (int j = 0; j < chessBoard.length ; j++) {

                chessBoard[i][j] = ""+(i+1)+ letters.charAt(j);




            }

        }

        System.out.println(Arrays.deepToString(chessBoard));




    }
}
