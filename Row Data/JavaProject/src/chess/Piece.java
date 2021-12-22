package chess;

abstract class Piece {
	private String name;
	private int x;
	private int y;
	private boolean isDead = false;
	private boolean team; // true = black, false = white
	
	Piece(String name, boolean team, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.team = team;
	}
		
	public boolean getTeam() {
		return team;
	}
		
	public String getName() {
		return name;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDead() {
		this.isDead = true;
	}
	
	public boolean isCoordinateWithinBoard(int x, int y) {
		if(!(x >= 0 && x < 8)) {
			if(!(y >= 0 && y < 8))
				return false;
		}
		return true;
	}
	
	abstract public boolean isValidMove(int x, int y);
	
	public boolean move(int x, int y) {
		if(this.isValidMove(x, y)) {
			setX(x); setY(y);
			return true;
		}
		return false;
	}
}

// TODO
// king		DONE
// rook		DONE
// bishop	DONE
// queen	DONE
// knight
// pawn		

class King extends Piece {
	King(int x, int y, boolean team) {
		super("K", team, x, y);
	}
	public boolean isValidMove(int x, int y) {
		if(!isCoordinateWithinBoard(x, y)) {
			return false;
		}
		
		if(x == getX()+1 || x == getX()-1) {
			if(y == getY()+1 || y == getY()-1) {
				return true;
			}
		}
		return false;
	}
}

class Rook extends Piece {
	Rook(int x, int y, boolean team) {
		super("R", team, x, y);
	}
	
	public boolean isValidMove(int x, int y) {
		// Rock can move in straight line without limit
		if(!isCoordinateWithinBoard(x, y)) {
			return false;
		}
		if(getX() == x && y != getY()) {
			return true;
		}
		if(getY() == y && x != getX()) {
			return true;
		}
		return false;
	}
}

class Bishop extends Piece {
	Bishop(int x, int y, boolean team) {
		super("B", team, x, y);
	}
	
	public boolean isValidMove(int x, int y) {
		if(!isCoordinateWithinBoard(x, y)) 
			return false;
		
		// Bishop can move diagonally without limit
		if(Math.abs(getY() - y) == Math.abs(getX() - x))
			return true;
		return false;
	}
}
class Queen extends Piece {
	Queen(int x, int y, boolean team) {
		super("Q", team, x, y);
	}
	
	public boolean isValidMove(int x, int y) {
		if(!isCoordinateWithinBoard(x,y))
			return false;
		
		// Queen can move either in stright line or diagonally without limit
		Bishop b = new Bishop(getX(), getY(), true);
		Rook r = new Rook(getX(), getY(), true);
		if(b.isValidMove(x, y) || r.isValidMove(x, y))
			return true;
		return false;
	}
}

class Knight extends Piece {
	Knight(int x, int y, boolean team) {
		super("N", team, x, y);
	}
	
	public boolean isValidMove(int x, int y) {
		if(!isCoordinateWithinBoard(x, y))
			return false;
		
		// Knight can move 
		return true;
	}
}

class Pawn extends Piece {
	Pawn(int x, int y, boolean team) {
		super("P", team, x, y);
	}
	
	public boolean isValidMove(int x, int y) {
		if(!isCoordinateWithinBoard(x, y))
			return false;
		
		// Pawn can move
		return true;
	}
}
