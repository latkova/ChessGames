package com.company;
// How many ways of setting up chess pieces to avoid them of being captured?

import java.util.Scanner;

public class ChessGame {

    public static void main(String[] args) {

        System.out.println("Enter chess piece (king, queen, rook, knight, bishop, or pawn): ");

        Scanner sc = new Scanner(System.in);
        int waysNumber;

        String userPiece_1, innerPiece_1;
        String innerPiece_2;
        String innerPiece_3;
        String innerPiece_4;
        String innerPiece_5;
        String innerPiece_6;

        userPiece_1 = sc.next();
        innerPiece_1 = "king";
        innerPiece_2 = "bishop";
        innerPiece_3 = "knight";
        innerPiece_4 = "queen";
        innerPiece_5 = "rook";
        innerPiece_6 = "pawn";

        if (userPiece_1.equals(innerPiece_1)){
            waysNumber = 4 * (64 - 4) + 6 * 4 * (64 - 6) + 6 * 6 * (64 - 9);
            System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_1 + "s to avoid them of being captured");
       }

        if (userPiece_1.equals(innerPiece_2)){
            waysNumber = 28 * (64 - 8) + 20 * (64 - 10) + 12 * (64 - 12) + 4 * (64 - 14);
            System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_2 + "s to avoid them of being captured");
        }

        if (userPiece_1.equals(innerPiece_3)) {
            waysNumber = 4 * (64 - 3) + 24 * (64 - 4) + 20 * (64 - 5) + 16 * (64 - 9);
            System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_3 + "s to avoid them of being captured");
        }

        if (userPiece_1.equals(innerPiece_4)) {
            waysNumber = 32 * (64 - 22) + 16 * (64 - 24) + 12 * (64 - 26) + 4 * (64 - 28);
            System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_4 + "s to avoid them of being captured");
        }

        if (userPiece_1.equals(innerPiece_5)) {
            waysNumber = 64 * (64 - 15);
            System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_5 + "s to avoid them of being captured");
        }

        if (userPiece_1.equals(innerPiece_6)) {
                waysNumber = 14 * (64 - 2) + 42 * (64 - 3);
                System.out.println(waysNumber + " ways  of setting up chess " + innerPiece_6 + "s to avoid them of being captured");
            }

    }
}
