package com.sai.beans;

public class Employee {

	private String name;
	private String id;
	private int salary;
	private Account acc;
	
	private Account acc1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	

	public Account getAcc1() {
		return acc1;
	}

	public void setAcc1(Account acc1) {
		this.acc1 = acc1;
	}

	

	/*@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", acc=" + acc + "]";
	}*/
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", acc=" + acc + ", acc1=" + acc1 + "]";
	}
	
	

}
