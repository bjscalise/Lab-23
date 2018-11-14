package com.Lab23.UserItemsCoffeeShop;

public class Users {
	
	private String fName;
	private String lName;
	private String phoneNum;
	private String email;
	private int id;
	
	
	public Users(String fName, String lName, String phoneNum, String email, int id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.id = id;
	}
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
