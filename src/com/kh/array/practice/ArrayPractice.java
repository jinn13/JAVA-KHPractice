package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.	
		
		int iArray[]=new int[10];
		for(int i=0;i<iArray.length;i++) {
			iArray[i]=i+1;
			System.out.print(iArray[i]+" ");
		}
	}
	public void practice2() {
//		길이가 10인 정수형 배열을 만들고 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc=new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
		String[] sArr={"사과", "귤", "포도", "복숭아", "참외"};	
		System.out.println(sArr[1]);
	}
	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		int sum=0;
		
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char c=sc.nextLine().charAt(0);
		System.out.print(str+"에 "+c+"가 존재하는 위치(인덱스) : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.printf("%c 개수 : ", c);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				sum+=1;
			}
		}
		System.out.print(sum);
	}
	public void practice6() {
/*
	“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
	범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다.“를 출력하세요
 */
		Scanner sc=new Scanner(System.in);
		String arr[]= {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num=sc.nextInt();
			
		if(num>=0&&num<7){
			System.out.println(arr[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}		
	}
	public void practice7() {
/*
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장 된 값들의 합을 출력하세요.
 */
		int sum=0;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			str+=arr[i]+" ";
		}

		System.out.println(str);
		System.out.println("총 합 : "+sum);
	}
	public void practice8() {
/*
	3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요.”를 출력하고
	다시 정수를 받도록 하세요.
 */
		Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.print("정수 : ");
			int num=sc.nextInt();
			
			if(num%2==1&&num>=3) {
				int arr[]=new int[num];
		
				for(int i=0;num/(i+1)!=1;i++) {
					arr[i]=1+i;	
					System.out.print(arr[i]+", ");
					}
				
				for (int j=(num/2)+1;j>0;j--) {
					if(j!=1) {
					arr[j]=j;
					System.out.print(arr[j]+", ");
					}else if(j==1) {
						System.out.print(arr[j-1]);	
					}
				}	
			
			}else {
				System.out.println("다시 입력하세요.");
				continue;
			}break;
			}
	}
	public void practice9() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int arr[]=new int[10];
		int i=0;
		while(i<10) {
			int random=(int)(Math.random()*10+1);
			arr[i]=random;
			System.out.print(arr[i]+" ");
			i++;
		}	
	}
	public void practice10() {
/*		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		ex.
		5 3 2 7 4 8 6 10 9 10 
		최대값: 10
		최소값: 2 	
*/
		int maxNum=0,minNum=10;
		
		int arr[]=new int[10];
		for (int i=0;i<10;i++) {
			int random=(int)(Math.random()*10+1);
			arr[i]=random;
			System.out.print(arr[i]+" ");
		}
		
		for(int j=0;j<10;j++) {
			if(arr[j]>maxNum) {
				maxNum=arr[j];
			}
			if(arr[j]<minNum) {
				minNum=arr[j];	
			}
		}
		System.out.println();
		System.out.println("최대값 : "+maxNum);
		System.out.println("최소값 : "+minNum);
	}
	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int arr[]=new int[10];
		
		for (int i=0;i<10;i++) {
			int random=(int)(Math.random()*10+1);
			arr[i]=random;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int k=0;k<10;k++)
		System.out.print(arr[k]+" ");
	}
	public void practice12() {
//		로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요
//		로또번호 45개, 그중에서 6개 선택
		int arr[]=new int[6];
		int maxNum=0, minNum=45;
		
		for(int i=0;i<6;i++) {
			int random=(int)(Math.random()*45+1);
			arr[i]=random;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		//Arrays.sort안쓰고 하는 방법이 있을텐데ㅠㅠㅠㅠㅠㅠㅠ
		Arrays.sort(arr);
		for(int k=0;k<6;k++)
			System.out.print(arr[k]+" ");
			System.out.println();
	}
	public void practice13() {
//	주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
//	char[]에 옮겨 담기(단, 성별 자리 이후부터는 *로 담기)

		Scanner sc=new Scanner(System.in);
		String str="";
		
		System.out.print("주민등록번호(-포함) : ");
		str=sc.nextLine();
		
		char arr[]=new char[14];
		for (int i=0;i<8;i++) {
			arr[i]=str.charAt(i);
			System.out.print(arr[i]);
		}
		for (int j=8;j<14;j++) {
			arr[j]='*';
			System.out.print(arr[j]);
		}
	}
}
	
	
	
