package days12;

public class Class04 {
	public static void main(String[] args) {
		Student std1 = new Student(1, "Jin", 100, 100, 100);
		System.out.println(std1.toString());
	}
}

class Student {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
		avg = tot / 3;
	}
	
	public String toString() {
		return num + " - " + name + " : " + kor + ", " + eng + ", " + mat;
	}
}
