package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
/*	4행 4열짜리 정수형 배열을 선언 및 할당하고
 *		1) 1 ~ 16까지 값을 차례대로 저장하세요.
 *		2) 저장된 값들을 차례대로 출력하세요. 
 */
		int iArray[][]=new int[4][4];
		int value=1;
		
		for(int i=0;i<iArray.length;i++) {
			for(int j=0;j<iArray.length;j++) {
				iArray[i][j]=value++;
			}
		}
		for(int i=0;i<iArray.length;i++) {
			for(int j=0;j<iArray.length;j++) {
				System.out.printf("%2d ", iArray[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
/*
 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
 *		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
 *		2) 저장된 값들을 차례대로 출력하세요.
 */
		int iArray[][]=new int[4][4];
		int value=16;
		
		for(int i=0;i<iArray.length;i++) {
			for(int j=0;j<iArray.length;j++) {
				iArray[i][j]=value--;
			}
		}
		for(int i=0;i<iArray.length;i++) {
			for(int j=0;j<iArray.length;j++) {
				System.out.printf("%2d ", iArray[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		String sArray[][]=new String[3][3];
		
		for(int i=0;i<sArray.length;i++) {
			for(int j=0;j<sArray.length;j++) {
				sArray[i][j]="("+i+", "+j+")";
			}
		}
		for(int i=0;i<sArray.length;i++) {
			for(int j=0;j<sArray.length;j++) {
			System.out.printf("%s", sArray[i][j]);	
			}
			System.out.println();
		}
	}
	public void practice4() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//		아래의 내용처럼 처리하세요.
		int iArray[][]=new int[4][4];
		int random=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for(int i=0;i<(iArray.length-1);i++) {
			for(int j=0;j<(iArray.length-1);j++) {
				random=(int)(Math.random()*10+1);
				iArray[i][j]=random;
			}
		}

		// 오른쪽칸+아래칸 결과 넣는 방법
		for(int i=0;i<iArray.length-1;i++) {
			for(int j=0;j<iArray.length-1;j++) {
				sum1+=iArray[i][j];
				sum2+=iArray[j][i];
				sum3+=iArray[i][j];
			}
			iArray[i][3]=sum1;
			iArray[3][i]=sum2;
			iArray[3][3]=sum3;
			sum1=0;
			sum2=0;
		}
		for(int i=0;i<iArray.length;i++) {
			for(int j=0;j<iArray.length;j++) {
				System.out.printf("%2d ", iArray[i][j]);
			}
			System.out.println();
		}
	}
	public void practice5() {
/* 	
 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면
 *	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
 *	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
 *	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)
 */
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		int random=0;
		
		
		while(true) {
		System.out.print("행 크기 : ");
		num1=sc.nextInt();
		System.out.print("열 크기 : ");
		num2=sc.nextInt();

		if(num1>=1&&num1<=10&&num2>=1&&num2<=10) {
		int arr[][]=new int[num1][num2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<num2;j++) {
				random=(int)((Math.random()*(90-64)+1)+64);
				arr[i][j]=random;
				System.out.printf("%2c ", (char)arr[i][j]);
			}
			System.out.println();
		}
		
		}else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			continue;
		}break;
	}
	}
	public void practice6() {
//	초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
//		단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.	
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr.length;j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	public void practice7() {
//		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
//		문자형 가변 배열을 선언 및 할당하세요.
//		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		int arr[][];
		int num3=97;
	
		System.out.print("행의 크기 : ");
		num1=sc.nextInt();
		arr=new int[num1][];
		
		for(int i=0;i<num1;i++) {
			System.out.print(i+"행의 크기 : ");
			num2=sc.nextInt();
			arr[i]=new int[num2];
			num2=0;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num3++;
				System.out.printf("%c ", (char)arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice8() {
/*	1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
	3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
	1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
	<출석부>
	1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
	7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
*/	
		int value=0;
		int value1=6;
		String arr1[]={"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
					  "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr2[][]=new String[3][2];
		String arr3[][]=new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=arr1[value];
				value++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=arr1[value1];
				value1++;
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public void practice9() {
//		위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
//		해당 학생이 어느 자리에 앉았는지 출력하세요.
		int value=0;
		int value1=6;
		String arr1[]={"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
					  "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr2[][]=new String[3][2];
		String arr3[][]=new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=arr1[value];
				value++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j]=arr1[value1];
				value1++;
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		Scanner sc=new Scanner(System.in);
		String name="";
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		name=sc.nextLine();

//		arr2, arr3을 전부 다 돌린후에 얘 위치를 뜨게 해야하는데..
//		우선 얘가 지금 어느 배열에 있는지부터 찾아볼까?
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				if(name.equals(arr2[i][j])) {
					if(j==0) {
					System.out.print("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					}else if(j==1) {
						System.out.print("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 오른쪽에 있습니다.");	
					}	
				}else {
					for(int k=0;k<arr3.length;k++) {
						for(int l=0;l<arr3[k].length;l++) {
							if(name.equals(arr3[k][l])) {
								if(l==0) {
								System.out.print("검색하신 "+name+" 학생은 2분단 "+(k+1)+"번째 줄 왼쪽에 있습니다.");
								return;
								}else if(l==1) {
									System.out.print("검색하신 "+name+" 학생은 2분단 "+(k+1)+"번째 줄 오른쪽에 있습니다.");
									return;
								}
							}
							
						}
					}
				}
			}
		}
	}
}
