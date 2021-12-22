package days14;

public class Class25 {
	public static void main(String[] args) {
		StaticF f = new StaticF();
	}
}


class StaticF {
	private int number;
	private static int num = 1; {
		number = 100;
		System.out.println("Instance variable initialize block 1");
	}
	
	static {
		System.out.println("StaticF static block");
		num = 55;
	}
	
	static int cnt = 0; 
	int serialNo; {
		++cnt;
		serialNo = cnt;
		System.out.println("Instance variable initalize block 2");
	}
}