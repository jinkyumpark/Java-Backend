package JDBC03;

public class Book_Dto {
	private int num;
	private String subject;
	private int makeyear;
	private int inprice;
	private int rentprice;
	private String grade;
	
	public Book_Dto(String subject, int makeyear, int inprice, int rentprice, String grade) {
		this.subject = subject;
		this.makeyear = makeyear;
		this.inprice = inprice;
		this.rentprice = rentprice;
		this.grade = grade;
	}
	
	public Book_Dto(int num, String subject, int makeyear, int inprice, int rentprice, String grade) {
		this.num = num;
		this.subject = subject;
		this.makeyear = makeyear;
		this.inprice = inprice;
		this.rentprice = rentprice;
		this.grade = grade;

	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMakeyear() {
		return makeyear;
	}
	public void setMakeyear(int makeyear) {
		this.makeyear = makeyear;
	}
	public int getInprice() {
		return inprice;
	}
	public void setInprice(int inprice) {
		this.inprice = inprice;
	}
	public int getRentprice() {
		return rentprice;
	}
	public void setRentprice(int rentprice) {
		this.rentprice = rentprice;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}