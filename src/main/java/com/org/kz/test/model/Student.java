package com.org.kz.test.model;

public class Student {
	
	private int id;
	private String sname;
	private double gpa;
	private int age;
	
	public Student(String sname, int age, double gpa){
		this.sname = sname;
		this.age = age;
		this.gpa = gpa;			
	}
	
	public Student (){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", gpa=" + gpa
				+ ", age=" + age + "]";
	}

	
	

}
