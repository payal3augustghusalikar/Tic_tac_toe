package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
        static String[] board;
       public static void main(String args []){
            board=new String[9];
            EmptyBoard();
            printBoard();
            UserInput();
  }
  static void printBoard() {
	  System.out.println("Valid cells are==> ");
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	static void EmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf("-");
			
		}
	}
	Scanner scanner = new Scanner(System.in);
	void UserInput() {
		String computerSymbol=null;
	
		System.out.println("Enter your choice X or O");
		String playerChoice = scanner.nextLine();
		if (playerChoice == "X") {
			computerSymbol="O";
			playerChoice = "X";	
		}
		
		else {
			 computerSymbol="X";
			 playerChoice = "O";	
		}
		 System.out.println("you entered-> " +playerChoice +", Opponent have -> " +computerSymbol);
		 printBoard();
	}
	void userMove() {
		System.out.println("Enter the position to move your choice");
		String playerMove  = scanner.nextLine();

		
	}
}