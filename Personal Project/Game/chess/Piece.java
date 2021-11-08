package chess;

public class Piece {
	private String name;
	private int[] coordinate = new int[2];
	private boolean isDead = false;
	
	public Piece(char name, int x, int y) {
		this.name = name;
		this.coordinate[0] = x;
		this.coordinate[1] = y;
	}
	
	public String getName() {
		return name;
	}
	
	public int getX() {
		return coordinate[0];
	}
	
	public int getY() {
		return coordinate[1];
	}
	
	public boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDeadTrue() {
		isDead = true;
	}
}
