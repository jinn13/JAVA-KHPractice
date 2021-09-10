package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {
//		Person person=new Person(20, 15.5, 20.4);
//		Student student=new Student("감자", 5, 180.1, 50.5, 7, "채소");
//		Employee emp=new Employee("샐러리", 458, 190.8, 90.5, 100000000, "기획부서");
//		System.out.println(person.information());
//		System.out.println(student.information());
//		System.out.println(emp.information());
		
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] std=new Student[3];
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		std[0]=new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1]=new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2]=new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
				
		// 위의 학생 정보 모두 출력 
		for (Student student : std) {
			System.out.println(student.information());
		}
		
//		emp[0]=new Employee(sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.nextLine());
		Scanner sc=new Scanner(System.in);
		int num=0;

		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] emp=new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		// 한 명씩 추가 될 때마다 카운트함
		while(true) {
				System.out.print("사원 이름 입력 : ");
				String name=sc.nextLine();
				System.out.print("나이 입력 : ");
				int age=sc.nextInt();
				System.out.print("신장 입력 : ");
				double height=sc.nextDouble();
				System.out.print("몸무게 입력 : ");
				double weight=sc.nextDouble();
				sc.nextLine();
				System.out.print("급여 입력 : ");
				int salary=sc.nextInt();	
				sc.nextLine();
				System.out.print("부서 입력 : ");
				String dept=sc.nextLine();
				
				emp[num]=new Employee(name, age, height, weight, salary, dept);
//				System.out.println(emp[num].information());
				
				num+=1;
				System.out.println("사원 "+num+"명이 입력되었습니다. ");
			
				System.out.println("계속 추가하시겠습니까?");
				String answer=sc.nextLine();
				
				// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
				// ‘n’일 경우 더 이상 그만 입력 받도록..
				if(answer.equals("y")||answer.equals("Y")) {
					continue;
				}else if(answer.equals("n")||answer.equals("N")) {
					System.out.println("프로그램을 종료합니다.");
					break;					
				}
		}
			
		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i=0;i<num;i++) {
			System.out.println(emp[i].information());
		}
	}
}
