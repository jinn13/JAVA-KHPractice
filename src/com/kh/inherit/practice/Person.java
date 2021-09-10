package com.kh.inherit.practice;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
	}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		return "나이 : "+this.age+" / 키 : "+this.height+" / 체중 : "+this.weight;
		
	}
}
