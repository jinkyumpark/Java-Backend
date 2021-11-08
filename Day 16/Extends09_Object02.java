package days16;

public class Extends09_Object02 {
	public static void main(String[] args) {
		UserClassB obj = new UserClassB();
		System.out.println("No Overriding toString => " + obj.toString());
		Point p = new Point(30, 20);
		System.out.println("Overriding toString => " + p.toString());
		String msg = "Point => " + p;
		System.out.println(msg);
		
	} 
}


class UserClassB {
	
}

class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(x=" + this.x + ", y=" + this.y + ")";
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public boolean equals(Point p) {
		if(p.getX() == this.x && p.getY() == this.y)
			return true;
		else
			return false;
	}
}