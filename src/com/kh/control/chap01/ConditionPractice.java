package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {
	public void method1() {
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		Scanner sc=new Scanner(System.in);
		int num=0;
		String st="";
		
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료\n메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
		
		//ctrl+space하면 자동완성이 되긴 하는데 손에 익어야 하니 우선 치기 
		switch (num) {
		case 1:
			st="입력";
			break;
		case 2:
			st="수정";
			break;
		case 3:
			st="조회";
			break;
		case 4:
			st="삭제";
			break;
		case 9:
			st="종료";
			break;
		}
		System.out.println(st+" 메뉴입니다.");
	}
	public void method2() {
//		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int nextInt = sc.nextInt();
		
		if(nextInt>0&&nextInt%2==0) {
			System.out.println("짝수다.");
		}else if(nextInt>0&&nextInt%2==1) {
			System.out.println("홀수다.");
		}else {
			System.out.println("양수만 입력해주세요.");
			//0은 좀 애매하네.. 양수도 음수도 아니니까 아무래도 괜찮지 않나?
		}
	}
	public void method3() {
		/*
		 *  국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
			합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
			(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
			합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
			불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */
		Scanner sc=new Scanner(System.in);
		int kor=0, math=0, eng=0;
		double total=0, avg=0;
//	평균값이 소수점 아래가 매번 90.0이런식으로 나옴
//	avg와 total까지 실수형으로 바꾸니 소수점 첫자리까지 잘 나옴
		
		System.out.print("국어점수 : ");
		kor=sc.nextInt();
		System.out.print("수학점수 : ");
		math=sc.nextInt();
		System.out.print("영어점수 : ");
		eng=sc.nextInt();
		total=kor+math+eng;
		avg=total/3;
		
		if(kor>=40&&math>=40&&eng>=40&&avg>=60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+total);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void method4() {
//		수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		Scanner sc=new Scanner(System.in);
		int month=0;
		String season="";
		System.out.print("1~12 사이의 정수 입력 : ");
		month=sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";			
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default:
			System.out.println(month+"월은 잘못 입력된 달입니다.");
		return;
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}
	public void method5() {
		/*아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		  로그인 성공 시 “로그인 성공”, 
		  아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		  비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		*/
		Scanner sc=new Scanner(System.in);
		String id="", pw="";
		System.out.print("아이디 : ");
		id=sc.nextLine();
		System.out.print("비밀번호 : ");
		pw=sc.nextLine();
		
		if(id.equals("ismoon")&&pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else if(!(id.equals("ismoon"))&&pw.equals("1234")){
			System.out.println("아이디가 틀렸습니다.");
		}else if(id.equals("ismoon")&&!(pw.equals("1234"))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(!(id.equals("ismoon"))&&!(pw.equals("1234"))){
			System.out.println("등록되지 않은 아이디와 비밀번호입니다.");
		}
	}
	public void method6() {
/*	사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
	단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만 가능합니다.
	(단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)	
*/
		String member="";
		Scanner sc=new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");	
		member=sc.nextLine();
		
		switch(member) {
		case "관리자":
			System.out.printf("회원관리, 게시글 관리\n게시글 작성, 댓글 작성\n게시글 조회\n");
			break;
		case "회원":
			System.out.printf("게시글 작성, 게시글 조회\n댓글 작성\n");
			break;
		case "비회원":
			System.out.printf("게시글 조회\n");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
	}
	public void method7() {
/*
	키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
	BMI = 몸무게 / (키(m) * 키(m))
	BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	BMI가 30이상일 경우 고도 비만	
 */
		double height=0.0, weight=0.0, bmi=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		height=sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight=sc.nextDouble();
		bmi=weight/(height*height);
		System.out.print("BMI 지수 : "+bmi);
		System.out.println();
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi>=18.5&&bmi<23){
			System.out.println("정상체중");		
		}else if(bmi>=23&&bmi<25) {
			System.out.println("과체중");		
		}else if(bmi>=25&&bmi<30) {
			System.out.println("비만");		
		}else if(bmi>30) {
			System.out.println("고도 비만");		
		}
	}
	public void method8() {
/*	키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
	(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
	“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	(printf()문을 이용하여 마지막 출력문을 작성해보시오.)	
 */
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=0, sum=0;
		char op='\u0000';
		
		System.out.print("피연산자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		op=sc.nextLine().charAt(0);
		
		if(num1<0||num2<0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
			switch(op) {
			case '+':
				sum=num1+num2;
				break;
			case '-':
				sum=num1-num2;
				break;
			case '*':
				sum=num1*num2;
				break;
			case '/':
				sum=num1/num2;
				break;
			case '%':
				sum=num1%num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
//		System.out.println(num1+" "+op+" "+num2+" = "+sum);
		System.out.printf("%d %c %d = %d", num1, op, num2, sum);
	}
	public void method9() {
/*	중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
	총 점 100점 중 배점으로는 다음과 같다.
	중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
	이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
	총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
	아니면 Fail을 출력하세요.		
 */
		Scanner sc=new Scanner(System.in);
		double num1=0, num2=0, num3=0, num4=0;
		double score1=0, score2=0, score3=0, score4=0, sum=0;
		
		System.out.print("중간 고사 점수 : ");
		num1=sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		num2=sc.nextDouble();
		System.out.print("과제 점수 : ");
		num3=sc.nextDouble();
		System.out.print("출석 회수 : ");
		num4=sc.nextDouble();
		
		score1=num1*0.2;
		score2=num2*0.3;
		score3=num3*0.3;
		score4=((num4/20)*100)*0.2;
		sum=score1+score2+score3+score4;
		
		System.out.println("============결과============");

		if(sum>=70&&num4>=14) {
		System.out.println("중간 고사 점수(20) : "+score1);
		System.out.println("기말 고사 점수(20) : "+score2);
		System.out.println("과제 점수    (20) : "+score3);
		System.out.println("출석 점수    (20) : "+score4);
		System.out.println("총점 : "+sum);
		System.out.println("PASS");
		}else if(sum<70&&num4>=14) {
			System.out.printf("FAIL [점수미달] (총점 %.1f)\n", sum);
		}else if(sum>=70&&num4<14) {
			System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", (int)num4);
		}else if(sum<70&&num4<14) {
			System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", (int)num4);
			System.out.printf("FAIL [점수미달] (총점 %.1f)\n", sum);
		}
	}
	public void method10() {
//		앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		Scanner sc=new Scanner(System.in);
		ConditionPractice cp=new ConditionPractice();
		
		int num=0;
		System.out.println("실행할 기능을 선택하세요.");
		System.out.print("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n");
		System.out.print("5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. Pass/Fail\n");
		System.out.print("선택 : ");
		num=sc.nextInt();
		System.out.println();

		

		switch(num) {
		case 1:
			System.out.println("==== 1. 메뉴 출력 실행 ====");
			cp.method1();
			break;
		case 2:
			System.out.println("==== 2. 짝수/홀수 실행 ====");
			cp.method2();
			break;
		case 3:
			System.out.println("==== 3. 합격/불합격 실행 ====");
			cp.method3();
			break;
		case 4:
			System.out.println("==== 4. 계절 실행 ====");
			cp.method4();
			break;
		case 5:
			System.out.println("==== 5. 로그인 실행 ====");
			cp.method5();
			break;
		case 6:
			System.out.println("==== 6. 권한 확인 실행 ====");
			cp.method6();
			break;
		case 7:
			System.out.println("==== 7. BMI 실행 ====");
			cp.method7();
			break;
		case 8:
			System.out.println("==== 8. 계산기 실행 ====");
			cp.method8();
			break;
		case 9:
			System.out.println("==== 9. Pass/Fail 실행 ====");
			cp.method9();
			break;
		}
	}
}
