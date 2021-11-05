package days13;

public class Class17 {
	public static void main(String[] args) {
		Student std1 = new Student("Jin", 88, 99, 66);
		Student std2 = new Student("Yerim", 98, 87, 89);
		Student std3 = new Student("Rona", 100, 100, 100);
	}
}

class Student {
	private int bunho;
	private String name;
	private int[] scores;
	private String[] subjects = {"Kor", "Eng", "Mat"};
	private int tot;
	private double avg;
	private char grade;
	
	public Student() {
		this.scores = new int[3];
	}
	
	public Student(String name, int kor, int eng, int mat) {
		this();
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = mat;
	}
	
	public void copy1(Student b) {
		this.bunho = b.bunho;
		this.name = b.name;
		for(int i = 0; i < subjects.length; i++) 
			this.scores[i] = b.scores[i];
	}
	
	public Student copy2() {
		Student t = new Student();
		t.bunho = this.bunho;
		t.name = this.name;
		for(int i = 0; i < subjects.length; i++)
			t.scores[i] = this.scores[i];
		return t;
	} 
	
}


