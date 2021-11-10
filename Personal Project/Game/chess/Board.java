package chess;
//king, rook, bishop, queen, knight, pawn

public class Board {
	private Piece[][] board = new Piece[8][8];
	
	Board() {
		// Initialize black(true) Pieces
		// Pawn
		for(int i = 0; i < 8; i++)
			board[1][i] = new Pawn(1, i, true);

		// Rook
		board[0][0] = new Rook(0, 0, true);
		board[0][7] = new Rook(0, 7, true);
		// Bishop
		board[0][1] = new Bishop(0, 1, true);
		board[0][6] = new Bishop(0, 6, true);
		// Knight
		board[0][2] = new Knight(0, 2, true);
		board[0][5] = new Knight(0, 5, true);
		// Queen
		board[0][4] = new Queen(0, 4, true);
		// King
		board[0][3] = new King(0, 3, true);
		
		// Initialize white(false) Piece;
		for(int i =0; i < 8; i++)
			board[6][i] = new Pawn(7, i, false);
		// Rook
		board[7][0] = new Rook(0, 0, false);
		board[7][7] = new Rook(0, 7, false);
		// Bishop
		board[7][1] = new Bishop(0, 1, false);
		board[7][6] = new Bishop(0, 6, false);
		// Knight
		board[7][2] = new Knight(0, 2, false);
		board[7][5] = new Knight(0, 5, false);
		// Queen
		board[7][3] = new Queen(0, 4, false);
		// King
		board[7][4] = new King(0, 3, false);

	}
	
	public void printBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.printf("|%s\t", board[i][j] != null ? board[i][j].getTeam() ? board[i][j].getName():board[i][j].getName().toLowerCase() : "");
			}
			System.out.println("|");
		}
	}

}
