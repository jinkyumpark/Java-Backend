package days18;

public class Extends11_Interface04 {
	public static void main(String[] args) {
		
	}
}



class Unit {
	int hp;
	int max_hp;
	Unit(int p) {
		max_hp = p;
		hp = (int) (p *0.8);
	}
	public void printHP() {
		System.out.println("Max HP : " + max_hp + ", Current HP : " + hp);
	}
	
	abstract public void move() {
		
	}
}

class GroundUnit extends Unit {
	GroundUnit(int p ) {
		super(p);
	}
	@Override
	public void move(int x, int y) {
		System.out.println("x: " + x + ", y:" + y);
	}
}

class AirUnit extends Unit {
	AirUnit(int p) {
		super(p);
	}
	@Override
	public void move(int x, int y) {
		System.out.println("x:" + x + ",y" + y);
	}
}

class Tank extends GroundUnit {
	Tank() {
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}