package com.ezen.dto;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String zip_num;
	private String address;
	private String phone;
	private char useryn;
	private Date indate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZip_num() {
		return zip_num;
	}
	public void setZip_num(String zip_num) {
		this.zip_num = zip_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getUseryn() {
		return useryn;
	}
	public void setUseryn(char useryn) {
		this.useryn = useryn;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
}

/*

create table member(
	id varchar(20) not null,
	pwd varchar(20) not null,
	name varchar(20) not null,
	email varchar(20) not null,
	zip_num varchar(10) not null,
	address varchar(100) not null,
	phone varchar(20) not null,
	useyn char(1) default 'y',
	indate datetime default now(),
	constraint pd_id primary key(id)
);


*/