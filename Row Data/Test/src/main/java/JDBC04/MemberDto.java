package JDBC04;

import java.sql.Date;

public class MemberDto {
	private int membernum;
	private String name;
	private String phone;
	private Date birth;
	private int bpoint;
	private Date joinDate;
	
	public MemberDto(int membernum, String name, String phone, Date birth, int bpoint, Date joinDate, String gender, int age) {
		this.membernum = membernum;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.bpoint = bpoint;
		this.joinDate = joinDate;
		this.gender = gender;
		this.age = age;
	}
	
	public MemberDto() {}
	
	public int getMembernum() {
		return membernum;
	}
	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getBpoint() {
		return bpoint;
	}
	public void setBpoint(int bpoint) {
		this.bpoint = bpoint;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String gender;
	private int age;
}
