package com.sai.beans;

public class Employee {
	
	private String ename;
	private String esal;
	private Account acc;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	public void getDetails()
	{
		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Ename= "+ename);
		System.out.println("Esal= "+esal);
		System.out.println("            Account Details");
		System.out.println("            ----------------");
		System.out.println("            accNo= "+acc.getAccNo());
		System.out.println("            accName= "+acc.getAccName());
		System.out.println("            accType= "+acc.getAccType());
	
	}
}
