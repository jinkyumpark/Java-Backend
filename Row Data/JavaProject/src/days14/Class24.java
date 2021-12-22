package days14;

public class Class24 {
	public static void main(String[] args) {
		System.out.printf("StaticD.count = %d\n", StaticD.getCount());
		StaticD.setCount(15);
		System.out.printf("StaticD.count = %d\n", StaticD.getCount());
		StaticD d1 = new StaticD();
		System.out.printf("StaticD.count = %d\n", d1.getCount1());
		d1.setCount1(15);
		System.out.printf("StaticD.count = %d\n", d1.getCount1());
	}
}

class StaticD {
	private static int count;
	
	public static void setCount(int count) {
		StaticD.count = count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public void setCount1(int count) {
		StaticD.count = count;
	}
	public int getCount1() {
		return StaticD.count;
	}
}