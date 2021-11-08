package days16;

public class Extends09_Object01 {
	public static void main(String[] args) {
		UserClass obj = new UserClass();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj); // same as obj.toString()
	}
}

class UserClass extends Object {
	
}
