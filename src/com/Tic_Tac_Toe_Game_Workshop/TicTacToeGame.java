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
        System.out.println("Player choose X or O and decide if play the game or not.");
        playerComputer();
    }
    public static void createBoard(Scanner scan, char[] board)
    {
        for(int index=1; index<board.length; index++)
            board[index]= scan.next().charAt(0);
    }
    public static void playerComputer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have two choices to check if you can play the TicTacToe game or not ?");
        System.out.println("X:Cannot play the Game.");
        System.out.println("O: Can Play the game.");
        System.out.println("Enter your choice X or O.");
        char ch = scan.next().charAt(0);
        switch(ch)
        {
            case 'X':
                System.out.println("Sorry, You cannot Play the Game.");
                break;
            case 'O':
                System.out.println("Congratulations,You can Play the Game.");
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
    }
}
