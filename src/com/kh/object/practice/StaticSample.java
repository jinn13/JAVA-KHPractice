package com.kh.object.practice;
public class StaticSample {
	private static String value;

	// value의 getter setter 구현
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value=value;
	}

	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 → char 배열 응용
		int num=0;
		int arr[] = new int[value.length()];
		
		for(int i=0;i<value.length();i++) {
			arr[i]=(int)(value.charAt(i));
		}
		
		for(int i=0;i<value.length();i++) {
			if(arr[i]<=90) {
				arr[i]=arr[i];
			}else if(arr[i]>=90) {
				arr[i]-=32;
			}
		}
		
		value="";
		for(int i=0;i<4;i++) {
			value+=(char)arr[i];
		}
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value값을 전달받은 문자로 변경하는 static 메소드
		char arr[]=value.toCharArray();
		for(int i=1;i<=value.length();i++) {
			if(i==index) {
				arr[i-1]=c;
			}
		}
		String answer=(value.charAt(index-1)+" → "+c+" : ");
		value=String.valueOf(arr);
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		int num=value.length();
		return num;
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		String string=value+str;
		return string;
	}
}
