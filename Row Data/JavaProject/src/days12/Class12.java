package days12;

public class Class12 {
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan(0);
		g1.print();
		g2.print();
	}
}

class Gugudan {
	private int dan;
	
	public Gugudan() {
		this.dan = 0;
	}
	
	public Gugudan(int dan) {
		this.dan = dan;
	}
	
	public void print() {
		if(dan == 0) {
			for(int i = 2; i <= 9; i++) {
				for(int j = 2; j <= 9; j++) {
					System.out.printf("%dx%d = %d\n", i, j, i*j);
				}
			}
		} else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%dx%d = %d\n", dan, i, dan*i);
			}
		}
	}
}