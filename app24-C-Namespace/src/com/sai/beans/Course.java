package com.sai.beans;

public class Course {
	
	private String cid;
	private String cname;
	private String cfee;
	
	public Course(String cid, String cname, String cfee) {
		//super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	

}
