package com.zhy.Model.User;

public class User {
	private String name;
	private int    age;
	private String address;
	private int    number;
	private String pass;
	private String bridate;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setBridate(String bridate) {
		this.bridate = bridate;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public int getNumber() {
		return number;
	}
	public String getPass() {
		return pass;
	}
	public String getBridate() {
		return bridate;
	}
	
	public String selectFromDB() {
		return "Name="+name+",Age="+age+",Address="+address+",Number="+number+".";
	}
}
