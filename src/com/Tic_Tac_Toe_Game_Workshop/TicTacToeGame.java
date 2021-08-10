package com.Tic_Tac_Toe_Game_Workshop;
import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic-Tac-Toe Game.");
        Scanner scan = new Scanner(System.in);
        char[] board=new char[10];
        System.out.println("The TicTacToe board for a player to start fresh is created.");
        createBoard(scan,board);
    }
    public static void createBoard(Scanner scan, char[] board)
    {
        for(int index=1; index<board.length; index++)
            board[index]= scan.next().charAt(0);
    }
}
