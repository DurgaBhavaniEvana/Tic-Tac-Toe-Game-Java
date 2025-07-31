package Creation;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    char board[][]=new char[3][3];
    for(int i=0;i<board.length;i++) {
    	for(int j=0;j<board[0].length;j++) {
    		board[i][j]=' ';
    	}
    }
    char player='X';
    boolean gameOver=false;
    while(!gameOver) {
    	printBoard(board);
    	System.out.println("player "+player+" enter:");
    	int i=sc.nextInt();
    	int j=sc.nextInt();
    	if(i>2||j>2)
    		System.out.println("give proper values...");
    	else {
    	if(board[i][j]==' ') {
    		board[i][j]=player;
    		gameOver=ifWon(board,player);
    		if(gameOver)
    			System.out.println(player +" Win the game...");
    		else {
    			player=(player=='X')? 'O':'X';
    		}
    	}
    	else
    		System.out.println("Invalid Move...Try Again!");
    	}
    }
    printBoard(board);
	}

	private static boolean ifWon(char[][] board, char player) {
		for(int i=0;i<board.length;i++) {
			if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player) {
				return true;
			}
		}
		
		for(int i=0;i<board[0].length;i++) {
			if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player) {
				return true;
			}
		}
		if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
			return true;
		if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player)
			return true;
	return false;
	}

	private static void printBoard(char[][] board) {
		 for(int i=0;i<board.length;i++) {
		    	for(int j=0;j<board[0].length;j++) {
		    		System.out.print(board[i][j]+"|");
		    	}
		    	System.out.println();
		    }
	}

}
