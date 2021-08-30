package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
	Scanner sc=new Scanner(System.in);
	int num1=0;
	String result="";
	
	System.out.print("정수 : ");
	num1=sc.nextInt();
	result=(num1>0)?"양수다.":"양수가 아니다.";
	
	System.out.println(result);
	}
	public void method2() {
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		String result1="";

		
		System.out.print("정수 : ");
		num1=sc.nextInt();
		result1=num1==0?"0이다":(num1>0?"양수다":"음수다");
		
		System.out.println(result1);
	}
	public void method3() {
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		Scanner sc=new Scanner(System.in);
		int num1=0;
		String result="";
		
		System.out.print("정수 : ");
		num1=sc.nextInt();
		result=(num1%2==0)?"짝수다":"홀수다";
		System.out.println(result);
	}
	public void method4() {
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 
//		인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=0, result1=0, result2=0;
		
		System.out.print("인원 수 : ");
		num1=sc.nextInt();
		System.out.print("사탕 개수 : ");
		num2=sc.nextInt();		
		System.out.println();
		
		result1=num2/num1;
		result2=num2%num1;

		System.out.println("1인당 사탕 개수 : "+result1);
		System.out.println("남는 사탕 개수 : "+result2);
		
	}
	public void method5() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
		Scanner sc=new Scanner(System.in);
		int num1=0;
		String result1="";
		
		System.out.print("나이 : ");
		num1=sc.nextInt();

		result1=((num1>=13)&&(num1<=19))?"청소년":(num1>19)?"성인":"어린이";
		System.out.println();

		System.out.println(result1);
	}
	public void method6() {
//	3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=0, num3=0;
		boolean result=false;
		
		System.out.print("입력1 : ");
		num1=sc.nextInt();
		System.out.print("입력2 : ");
		num2=sc.nextInt();
		System.out.print("입력3 : ");
		num3=sc.nextInt();
		System.out.println();
		
		result=(num1==num2)&&(num1==num3)&&(num2==num3);
		System.out.println(result);
	}
}
