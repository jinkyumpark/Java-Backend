package days12;

public class Class10 {
	public static void main(String[] args) {
		CClass c1 = new CClass(20);
		CClass c2 = new CClass(30);
		CClass c3 = new CClass();
	}
}

class CClass {
	private int age;
	
	CClass(int a) {
		age = a;
	}
	
	CClass() {
		this.age = 40;
	}
	
	public int getAge() { return age; }
	public void setAge(int age) {this.age = age;}
}
