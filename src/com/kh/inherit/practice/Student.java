package com.kh.inherit.practice;

public class Student extends Person {
	private int grade;		//	학년
	private String major;	//	전공
	
	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name=name;
		this.grade = grade;
		this.major = major;
	}
	@Override
	public String information() {
		
		return "학생 이름 : "+super.name+" / "+super.information()+" / 학년 : "+this.grade+" / 전공 : "+this.major;
	}
}
