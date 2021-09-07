package com.kh.object.practice;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		int arr[]=new int[6];
		int minNum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		// 응용 → 오름차순 정렬로 출력
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					minNum=arr[j];
					arr[j]=arr[i];
					arr[i]=minNum;
				}
			}
		}
		System.out.print("1. 랜덤 값 : ");
		for(int k=0;k<arr.length;k++) {			
			System.out.print(arr[k]+" ");
		}
	}
		
	public void outputChar(int num, char c) {
		//매개변수로 전달받은 문자 c를 전달받은 num 갯수만큼 출력하는 메소드
		System.out.print("\n2. "+c+"문자 "+num+"개 출력 : ");
		for(int i=0;i<num;i++) {
			System.out.print(c+" ");
		}
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		char ch='\u0000';
		
		System.out.print("\n3. 랜덤 영문자 출력 : ");
		int num=(int)(Math.random()*2+1);
		switch(num) {
		case 1:
			ch=(char)(Math.random()*((90-65)+1)+65);
			System.out.print(ch);
			break;
		case 2:
			ch=(char)(Math.random()*((122-97)+1)+97);
			System.out.print(ch);
			break;
		}
		return ch;		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. → 없으면 null 리턴
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.print("\n4. "+str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값 출력 : ");
		for(int i=0;i<str.length();i++) {
			if(i>=index1&&i<index2) {
				System.out.print(arr[i]);
			}else if(i==index1&&i==index2){
				System.out.println("null");
			}
		}
		return str;
	}
}
