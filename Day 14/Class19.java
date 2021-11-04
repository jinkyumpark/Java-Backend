package days14;

public class Class19 {
	public static void main(String[] args) {
		System.out.printf("count = %d\n", StaticB.count);
		StaticB b1 = new StaticB();
		System.out.printf("b1.num = %d, count = %d\n", b1.bunho, StaticB.count);
		
	}
}

class StaticB {
	int num;
	static int count = 0;
	int bunho;
	
	public StaticB() {
		count++;
		bunho = count;
	}
}