package com.company;
// How many ways of setting up chess kings to avoid them of being captured?

import java.util.Scanner;

public class ChessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter chess piece (king, queen, rook, knight, bishop, or pawn): ");

        int waysNumber;

        String userPiece_1, innerPiece_1;
        String innerPiece_2;
        userPiece_1 = sc.next();
        innerPiece_1 = "king";
        innerPiece_2 = "bishop";

        if (userPiece_1.equals(innerPiece_1)){

            waysNumber = 4 * (64 - 4) + 6 * 4 * (64 - 6) + 6 * 6 * (64 - 9);
            System.out.println(waysNumber + " ways  of setting up chess kings to avoid them of being captured");
        }

        if (userPiece_1.equals(innerPiece_2)){
            waysNumber = 28 * (64-8) + 20 * (64-10) + 12 * (64-12) + 4 * (64-14);
            System.out.println(waysNumber + " ways  of setting up chess bishops to avoid them of being captured");
        }

        else {
            System.out.println("Program for your chess piece " + userPiece_1 + " is still in process...");
        }
    }
}
