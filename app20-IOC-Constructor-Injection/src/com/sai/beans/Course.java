package com.sai.beans;

public class Course {
	
	private String cid;
	private String cname;
	private int cfee;	
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCfee() {
		return cfee;
	}

	public void setCfee(int cfee) {
		this.cfee = cfee;
	}
	
	public Course()
	{
		
	}
	public Course(String cid, String cname, int cfee) {
		//super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	public void getDetails()
	{
		System.out.println("Course Details");
		System.out.println("----------------------");
		System.out.println("Course Id    :"+cid);
		System.out.println("Course Name  :"+cname);
		System.out.println("Course Fee   :"+cfee);
		
	}
	

}
