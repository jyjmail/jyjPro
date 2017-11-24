package com.jyj.poiTest.model;

public class User {
	private String num;
	private String name;
	private Integer age;
	private String nick;
	

	public User() {
		
	}

	public User(String num, String name, Integer age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
