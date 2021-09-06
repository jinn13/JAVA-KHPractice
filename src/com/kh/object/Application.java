package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {
		// 매개변수 생성자를 이용하여 3개의 객체 생성(위의 사용데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		Product phone1=new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product phone2=new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product phone3=new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
//		phone1.Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
//		phone2.Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
//		phone3.Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

		System.out.println(phone1.information());
		System.out.println(phone2.information());
		System.out.println(phone3.information());
		System.out.println("=====================================================");
		
		// 각 객체의 가격을 모두 120만원으로 변경/부가세율도 모두 0.05로 변경
		// 객체가 가진 필드 값 출력 확인
		phone1.setPrice(1200000);
		phone2.setPrice(1200000);
		phone3.setPrice(1200000);
		phone1.setTax(0.05);
		phone2.setTax(0.05);
		phone3.setTax(0.05);
	
		System.out.println(phone1.information());
		System.out.println(phone2.information());
		System.out.println(phone3.information());
		System.out.println("=====================================================");
		
		//각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격=가격+(가격*부가세율)
		
		System.out.print("상품 = "+phone1.getName()+"\n부가세 포함 가격 = "+
						((int)(phone1.getPrice()+(phone1.getPrice()*phone1.getTax()))+"원"));
		System.out.print("\n상품 = "+phone2.getName()+"\n부가세 포함 가격 = "+
						((int)(phone2.getPrice()+(phone2.getPrice()*phone2.getTax()))+"원"));
		System.out.print("\n상품 = "+phone3.getName()+"\n부가세 포함 가격 = "+
						((int)(phone3.getPrice()+(phone3.getPrice()*phone3.getTax()))+"원"));
	}
}
