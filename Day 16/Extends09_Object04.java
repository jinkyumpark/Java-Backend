package days16;

public class Extends09_Object04 {
	public static void main(String[] args) {
		Human s1 = new Human("Jin", 22);
		Human s2 = new Human("Jin", 22);
		Human s3 = new Human("Jin", 22);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		if (s1 == s2)
			System.out.println("s1 and s2 are equal");
		else
			System.out.println("s1 and s2 are different");

		if (s1.equals(s2))
			System.out.println("s1 and s2 are equal");
		else
			System.out.println("s1 and s2 are differnet");
	}
}

class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		String info = "name = " + this.name + ", ";
		info += "age = " + this.age;
		return info;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	
	  public boolean equals(Human h) { 
		  if(h.equals(this.name) && h.getAge() == this.age) 
			  return true; 
		  else
			  return false; 
	  }
	 
	public boolean equals(Object obj) {
		if (!(obj instanceof Human))
			return false;
		Human target = (Human) obj;
		
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;
		boolean result = flag_name && flag_age;
		
		return result;
	}
}