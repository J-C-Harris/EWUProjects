////////////////////////////////////////////////////////////////////////
// James Harris and Marc Viehouser
// 10/04/2024
//
// Sources:
//
//
// Purpose:
//
////////////////////////////////////////////////////////////////////////


import java.lang.reflect.Array;

public class Main { // Display the board
    static int[][] chessBoard = new int[7][7];

    static void displayFunction(){
        for (int[] ruby : chessBoard) {
            for (int j = 0; j < ruby.length; j++) {
                // empty space symbol
                if (ruby[j] == 0) {
                    System.out.print("#|");
                }
                // pawn symbol
                if (ruby[j] == 1) {
                    System.out.print("P|");
                }
                // knight symbol
                if (ruby[j] == 1) {
                    System.out.print("K|");
                }
                // bishop symbol
                if (ruby[j] == 1) {
                    System.out.print("B|");
                }
                if (ruby[j] == 1) {
                    System.out.print("Q|");
                }
                if (ruby[j] == 1) {
                    System.out.print("R|");
                }
                // this makes the 2d array a square
                if (chessBoard[0][j] == 7 || chessBoard[0][j] == 15 || chessBoard[0][j] == 23 || chessBoard[0][j] == 31 || chessBoard[0][j] == 39 || chessBoard[0][j] == 47 || chessBoard[0][j] == 55 || chessBoard[0][j] == 63) {
                    System.out.println();
                }
            }
        }

    }

    //Main loop for the program
    public static void main(String[] args) {
        pawn testPawn = new pawn();
        testPawn.move();
    }
}