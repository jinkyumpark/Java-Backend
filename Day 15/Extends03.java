package days15;

public class Extends03 {

}

class SuperA {
	private int n1;
	public int n2;
	int n3;
	protected int n4;
	public int getN1() { return n1; }
}

class SubA extends SuperA {
	public void printInfo() {
//		System.out.print(this.n1);
		System.out.print(this.n2);
		System.out.print(this.n3);
		System.out.print(this.getN1());
	}
}