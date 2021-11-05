package days15;

public class Extends02 {
	public static void main(String[] args) {
		
	}
}

class Car {
	int engine;
	int displacement;
	int doorNum;
}

class K7 extends Car {
	public String toString() {
		return "Engine : " + engine + " displacement : " + displacement + "door number : " + doorNum;
	}
}