package chess;

public class Board {
	private Piece[][] board = new Piece[8][8];
	
	
	public void printBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.printf("|%s", board[i][j] != null ? board[i][j].getName() : " ");
			}
			System.out.println("|");
		}
	}

}
