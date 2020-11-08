package com.company;
// How many ways of setting up chess kings to avoid them of being captured?

import java.util.Scanner;

public class ChessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter chess piece: ");

        int waysNumber;

        String userPiece_1, innerPiece_1;
        userPiece_1 = sc.next();
        innerPiece_1 = "king";
        if (userPiece_1.equals(innerPiece_1)){

            waysNumber = 4 * (64 - 4) + 6 * 4 * (64 - 6) + 6 * 6 * (64 - 9);
            System.out.println(waysNumber + " ways  of setting up chess kings to avoid them of being captured");
        }
        else {
            System.out.println("Program for your chess piece " + userPiece_1 + " is still in process...");
        }
    }
}
