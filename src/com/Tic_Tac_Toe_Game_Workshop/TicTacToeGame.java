package com.Tic_Tac_Toe_Game_Workshop;
import java.util.Scanner;
public class TicTacToeGame {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic-Tac-Toe Game.");
        Scanner scan = new Scanner(System.in);
        char[] board=new char[10];
        int index;
        System.out.println("The TicTacToe board for a player to start fresh is created.");
        createBoard(scan,board);
        System.out.println("Player choose X or O and decide if play the game or not.");
        playerComputer();
        System.out.println("Displaying the current board.");
        showBoard();
        if (isSpaceFree(char[]board,int index)){
        System.out.println("Select the index from 1 to 9.");
        int n=scan.nextInt();
        System.out.println(n);
        System.out.println("Check whether the corners are available or not.");
        checkCornerIndexes(char board[]);
        System.out.println("Check whether the center or other remaining indexes are available or not.");
        checkCenterPositions(char board[]);
    }
        else
            System.out.println("Space is full.");
        chooseUserComputer();
        System.out.println("Check whether it is a tie or winning of game or need to move turn.");
        resultDetermination();
        System.out.println("Check whether Computer winning of game or need to move turn.");
        computerDetermination();
        System.out.println("Check whether the opponent Win r Play.");
        if (checkOpponent())
            System.out.println("Opponent win the game.");
        else
            System.out.println("Opponent has to play.");
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
    public static void showBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println(" | "+board[1]+" | "+board[2]+" | "+board[3]+" | ");
        System.out.println("|-----------|");
        System.out.println(" | "+board[4]+" | "+board[5]+" | "+board[6]+" | ");
        System.out.println("|-----------|");
        System.out.println(" | "+board[7]+" | "+board[8]+" | "+board[9]+" | ");
        System.out.println("|---|---|---|");
    }
    public static boolean isSpaceFree(char[]board,int index)
    {
        return board[index]==' ';
    }
    public static void chooseUserComputer()
    {
        int isCheck = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%2;
        if (isCheck == empCheck)
            System.out.println("User will play the game.");
        else
            System.out.println("Computer will play the game.");
    }
    public static void resultDetermination()
    {
        int isWinner = 2;
        int isTie = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%3;
        if (isWinner == empCheck)
            System.out.println("You are Winner.");
        if (isTie == empCheck)
            System.out.println("It is a Tie.");
        else
            System.out.println("Please change the turn.");
    }
    public static void computerDetermination()
    {
        int isComputer = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%2;
        if (isComputer == empCheck)
            System.out.println("Computer will play the game.");
        else
            System.out.println("Computer will take a turn.");
    }

    public static void checkOpponent()
    {
        boolean check = true;
        if(check) {
            System.out.println("Check is true");
        } else {
            System.out.println("Check is false");
        }
    }

    public static void checkCornerIndexes(char board[])
    {
        if (board.length == 0)
        {
            System.out.println("Board is empty.");
        }
        else{
            System.out.println("Board is Not empty.");
            System.out.println("left top corner: " +
                    board[1]);
            System.out.println("right top corner: " +
                    board[3]);
            System.out.println("left bottom corner: " +
                    board[7]);
            System.out.println("right bottom corner: " +
                    board[9]);
        }
    }
    public static void checkCenterPositions(char board[])
    {
        if (board.length == 0)
        {
            if (board[5]==0)
                System.out.println("Center index is free.");
            else{
                System.out.println("Print the other available free indexes.");
                System.out.println(board[2]+","+board[4]+","+board[6]+","+board[8]);
            }
        }
        else
            System.out.println("Board is full.");
    }
}
