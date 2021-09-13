package com.kh.io;

import java.util.Scanner;

import com.kh.io.model.dao.FileDao;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileDao fd=new FileDao();
		
		// 반복문을 통한 메뉴 실행
		String str=null;
		
		while(true) {
			 System.out.println("****** MyNote ******");
			 System.out.println("1. 노트 새로 만들기"); 		// fd.fileSave() 실행
			 System.out.println("2. 노트 열기");				// fd.fileOpen() 실행
			 System.out.println("3. 노트 열어서 수정하기"); 		// fd.fileEdit() 실행
			 System.out.println("4. 끝내기");
			 System.out.print("번호를 입력하세요 : ");
			 str=sc.nextLine();
			
			 switch(str) {
			 case "1" : 
				 fd.fileSave();
				 continue;
			 case "2" :
				 fd.fileOpen();
				 continue;
			 case "3":
				 fd.fileEdit();
				 continue;
			 case "4":
				 System.out.println("MyNote를 종료합니다.");
				 break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				continue;
			 }break;
		}

	}
}
