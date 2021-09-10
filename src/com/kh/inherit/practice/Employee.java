package com.kh.inherit.practice;

public class Employee extends Person {
	private int salary;		// 급여
	private String dept;	// 부서
	
	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name=name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String information() {
		return "사원 이름 : "+super.name+" / "+super.information()+" / 급여 : "+this.salary+" / 부서 : "+this.dept;
	}
}
