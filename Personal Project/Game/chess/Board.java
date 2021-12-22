package chess;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

// TODO set piece to ImageIcon

class Board extends JFrame implements ActionListener {
	static Piece[][] board = new Piece[8][8];
	
	boolean isSelected = false;
	int[] selectedPieceCoordinate = new int[2];
	
	public static void main(String[] args) {
		new Board();
	}
	
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
		
		Container con = getContentPane();
		
		con.setLayout(new GridLayout(8, 8));
		
		int index = 0;
		int row = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {

//				JButton btn = new JButton((board[i][j] == null ? "" : 
//					board[i][j].getTeam() ? board[i][j].getName() : board[i][j].getName().toLowerCase()) 
//						+ i + j, icon);
				ImageIcon icon = new ImageIcon("king_black.png");
				JButton btn = new JButton("King", icon);

				if(index % 2 == 0)
					btn.setBackground(Color.BLACK);
				index++;
				if((row % 2 == 0 && index % 8 == 0) || (row % 2 != 0 && index % 9 == 0) ) {
					row++;
					if(row % 2 == 0)
						index = 0;
					else
						index = 1;
				}
				
				btn.setOpaque(true);
				con.add(btn);
				btn.addActionListener(this);
			}
		}
						
		setTitle("Chess");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
		if(isSelected) {
			move(Board.board[selectedPieceCoordinate[0]][selectedPieceCoordinate[1]], 
					e.getActionCommand().charAt(0), e.getActionCommand().charAt(1));
		}
		
		if(Character.isAlphabetic(e.getActionCommand().charAt(0))) {
			isSelected = true;
			selectedPieceCoordinate[0] = e.getActionCommand().charAt(1);
			selectedPieceCoordinate[1] = e.getActionCommand().charAt(2);			
		} else {
			isSelected = false;
			selectedPieceCoordinate[0] = -1;
			selectedPieceCoordinate[1] = -1;
		}
	}
	
	public static void move(Piece piece, int x, int y) {
		// name, team, x, y
		
		Board.board[x][y] = Board.board[piece.getX()][piece.getY()];
		Board.board[piece.getX()][piece.getY()] = null;
	}
}
