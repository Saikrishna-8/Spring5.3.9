package com.sai.beans;

public class Branch {
	
	Student student;
	
	/*Branch(Student student)
	{
		this.student=student;
	}*/
	
	
	
	public String getBranch()
	{
		return "Computer Sceince";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
