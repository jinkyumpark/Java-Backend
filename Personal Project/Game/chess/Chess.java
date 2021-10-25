package chess;

// king, rook, bishop, queen, knight, pawn
// 8 * 8

public class Chess {
	public static void main(String[] args) {
		Piece[][] board = new Piece[8][8];
		printBoard(board);
	}
	
	public static void printBoard(Piece[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.printf("|%c", board[i][j] != null ? board[i][j].name : " ");
			}
			System.out.println("|");
		}
	}

	
}
