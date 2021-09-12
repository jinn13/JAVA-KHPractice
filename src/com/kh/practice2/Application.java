package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animal = new Animal[5];

		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)

		animal[0] = new Dog("뽀삐", "웰시코기", 8);
		animal[1] = new Dog("둥둥", "리트리버", 15);
		animal[2] = new Cat("나비", "치즈태비냥이", "소행성 B612", "노란색");
		animal[3] = new Cat("레오", "삼색냥이", "아제르 Z258", "삼색");
		animal[4] = new Cat("네로", "러시안블루", "다섯번째 로마", "검정색");

		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출

		for (Animal ani : animal) {
			ani.speak();
		}
	}
}
