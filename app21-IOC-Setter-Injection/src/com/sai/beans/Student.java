package com.sai.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;
	private int age;
	private String branch;
	private Address address;

	private List<String> skills;
	
	private Set<String> scourses;
	
	private Map<String,String> scourses_faculty;
	
	private Properties scource_cost; 

	public Properties getScource_cost() {
		return scource_cost;
	}

	public void setScource_cost(Properties scource_cost) {
		this.scource_cost = scource_cost;
	}

	public Set<String> getScourses() {
		return scourses;
	}

	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	

	public Map<String, String> getScourses_faculty() {
		return scourses_faculty;
	}

	public void setScourses_faculty(Map<String, String> scourses_faculty) {
		this.scourses_faculty = scourses_faculty;
	}
	
	

	public Student() {
	}

	public Student(String name, int age, String branch, Address address, List<String> skills) {
		super();
		this.name = name;
		this.age = age;
		this.branch = branch;
		this.address = address;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", branch=" + branch + ", address=" + address + ", skills="
				+ skills + ", scourses=" + scourses + ", scourses_faculty=" + scourses_faculty + ", scource_cost="
				+ scource_cost + "]";
	}

	
	
	
}
