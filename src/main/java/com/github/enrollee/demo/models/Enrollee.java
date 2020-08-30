package com.github.enrollee.demo.models;

import org.springframework.lang.NonNull;

public class Enrollee {
	
	private Integer id;
	
	@NonNull
	private String name;
	
	@NonNull
	private Integer age;

	public Enrollee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Enrollee [name=" + name + ", age=" + age + "]";
	}
}
