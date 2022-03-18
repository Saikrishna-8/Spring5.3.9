package com.sai.beans;

public class Student {
	
	private String sname;
	private String saddr;
	private Course course;
	
	public Student(String sname, String saddr, Course course) {
		super();
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", saddr=" + saddr + ", course=" + course + "]";
	}
	
	
}
