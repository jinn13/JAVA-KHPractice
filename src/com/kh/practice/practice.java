package com.kh.object.practice;

public class practice {

	public static void main(String[] args) {
		System.out.println("★☆크리스마스 트리☆★\n");
		int num=8;
		
		for(int i=0;i<num;i++) {
			if(i==0){
				for(int k=num-1;k>i;k--) {
					System.out.print(" ");	
					}
				System.out.println("☆");
			}
			
			for(int k=num-1;k>i;k--) {
			System.out.print(" ");	
			}
			
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				for(int j=-1;j<i;j++) {
					System.out.print("*");
				}
			
			System.out.println();
		}
		
			for(int k=2;k<num;k++) {
				System.out.print(" ");	
				}
			System.out.println("|_|");
		
		
		
		
//		벽에 붙은 삼각형 만들기(실습)
//		for(int i=0;i<5;i++) {
//			for(int j=-1;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
