package com.kh.control.chap02;
import java.util.Scanner;
public class LoopPractice {
	public void practice1() {
/*	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
	(for문 이용)	
 */
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num=sc.nextInt();
		
		if(num>0) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");			
				}
		}else if(num<0) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice2() {
//		practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc=new Scanner(System.in);
		int sum=0;

		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num=sc.nextInt();
			
			if(num>0) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
					}
			
			}else if(num<=0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}break;
		}
	}
	public void practice3() {
/*		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다. (for문 이용)
*/
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num=sc.nextInt();
		
		if(num<=0) {
			System.out.println("잘못 입력하셨습니다.");
		}else{
		for(int i=num;i>=1;i--) {
			System.out.print(i+" ");
			}
		}
	}
	public void practice4() {
//		practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
//		“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num=sc.nextInt();
			
			if(num>0) {
				for(int i=num;i>=1;i--) {
					System.out.print(i+" ");
				}
			}else if(num<=0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}break;
		}
	}
	public void practice5() {
//	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sum=0;
		System.out.print("정수를 하나 입력하세요 : ");
		num=sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			sum+=i;
			System.out.print(i);
			if(i<num) {
				System.out.print(" + ");
			}else if(i==num) {
				System.out.print(" = "+sum);
			}
		}
	}
	public void practice6() {
//	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.(for문 이용) 		
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=0;
		
		System.out.print("첫 번째 숫자 : ");
		num1=sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2=sc.nextInt();
		
		if(num1>0&&num2>0) {			
		if(num1>num2) {
			for(int i=num2;i<=num1;i++) {
				System.out.print(i+" ");			
				}
		}else if(num2>num1) {
			for(int i=num1;i<=num2;i++) {
				System.out.print(i+" ");			
				}
			}
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
	}
	public void practice7() {
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//	“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
	Scanner sc=new Scanner(System.in);
	int num1=0, num2=0;

	while(true) {
		System.out.print("첫 번째 숫자 : ");
		num1=sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2=sc.nextInt();
	if(num1>0&&num2>0) {	
		for(int i=num1;i<=num2;i++) {
			System.out.print(i+" ");
		}for(int i=num2;i<=num1;i++) {
			System.out.print(i+" ");
		}
	}else{
		System.out.println("1이상의 숫자를 입력해주세요.");
		continue;
	}
	break;
	}	
	}
	public void practice8() {
//	사용자로부터 입력 받은 숫자의 단을 출력하세요. (for문 이용)
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("======== "+num+"단 ========");
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
	}
	public void practice9() {
//	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.(for문 이용)
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num=sc.nextInt();
		
		if(num>2&&num<10) {
			for(int j=num;j<10;j++) {	
				System.out.println("===== "+j+"단 =====");
				for(int i=1;i<10;i++) {
					System.out.printf("%d * %d = %d\n", j, i, (j*i));
				}
			}
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	public void practice10() {
//	Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
//	“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc=new Scanner(System.in);
		int i=0;

		
		while(true) {
			System.out.print("숫자 : ");
			int num=sc.nextInt();
		if(num>=2&&num<=9) {
			for(i=num;i<10;i++) {
				System.out.println("===== "+i+"단 =====");
				for(int j=1;j<10;j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i*j));		
				}
			}
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			continue;
		}break;
		}
		}
	public void practice11() {
/*	사용자로부터 시작 숫자와 공차를 입력 받아
	일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
	단, 출력되는 숫자는 총 10개입니다. (FOR문 이용)
 *    - ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다. 5 5 5 5 	→ 여기서 공차는 5
 */
		int num1=0, num2=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		num1=sc.nextInt();
		System.out.print("공차 : ");
		num2=sc.nextInt();
		System.out.print(num1+" ");
		
		for(int i=0;i<9;i++) {
			System.out.print((num1+=num2)+" ");
		}
	}
	public void practice12() {
/*
	정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
	단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
	exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
	또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
	“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
	없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
	두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
*/	
		Scanner	sc=new Scanner(System.in);
		String op="";
		int num1=0, num2=0;
		
		while(true) {
		System.out.print("연산자(+, -, *, /, %) : ");
		op=sc.nextLine();
		if(op.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		System.out.print("정수1 : ");
		num1=sc.nextInt();
		System.out.print("정수2 : ");
		num2=sc.nextInt();
		sc.nextLine();

		switch(op) {
		case "+":
			System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1+num2));			
			break;
		case "-":
			System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1-num2));			
			break;
		case "*":
			System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1*num2));			
			break;
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");							
			}else {
				System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1/num2));			
			}
			break;
		case "%":
			System.out.printf("%d %s %d = %d\n", num1, op, num2, (num1%num2));
			break;
		default :
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");	
			break;
		}
		
		}
		
	}
}
