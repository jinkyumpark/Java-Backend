import java.util.Scanner;

public class PersonalProject {
	public static void main(String[] args) {
		int[][] currentBoard = new int[10][10];
		Scanner stdIn = new Scanner(System.in);
		
		boolean isGamePlaying = true;
		boolean isBlackTurn = true;
		boolean isBlackWon = false;
		
		while(isGamePlaying) {
			printBoard(currentBoard);
			int x;
			int y;
			boolean validMove = false;
			
			while(!validMove) {
				if(isBlackTurn) {
					System.out.print("Black Turn Horizontal: ");
					x = stdIn.nextInt();
					System.out.print("Black Turn Vertical: ");
					y = stdIn.nextInt();
				} else {
					System.out.print("White Turn Horizontal: ");
					x = stdIn.nextInt();
					System.out.print("White Turn Vertical: ");
					y = stdIn.nextInt();
				}
				
				if(currentBoard[x][y] == 0) {
					if(isBlackTurn) { // Black 1, White -1
						currentBoard[x][y] = 1; 
					} else {
						currentBoard[x][y] = -1;
					}
					validMove = true;
				} else {
					System.out.print("Invalid Move! Try Again.\n");
				}
			}
			
			if(determineWinner(currentBoard) == 1) {
				isGamePlaying = false;
				isBlackWon = true;
			} else if(determineWinner(currentBoard) == -1) {
				isGamePlaying = false;
				isBlackWon = false;
			} else {
				isBlackTurn = !isBlackTurn;
			}
		}
		
		if(isBlackWon) {
			System.out.println("Black has won!");
		} else {
			System.out.println("White has won!");
		}
	}
	
	public static void printBoard(int[][] board) {
		System.out.print("");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%4s", i);
		}
		System.out.println();
		for(int i = 0; i < board.length; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < board[i].length; j++) {
				System.out.printf("|%3s", board[i][j] == 0 ? "" : board[i][j] == 1 ? "B" : "W");
			}
			System.out.println("|");
		}

	}

	public static int determineWinner(int[][] board) {
		// If nobody wins, return 0; If black wins, return 1; If white wins, return -1  
		return 0;
	}
}
