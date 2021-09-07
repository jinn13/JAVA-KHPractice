package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample NSS=new NonStaticSample();
		NSS.printLottoNumbers();
		
		NSS.outputChar(5, 'z');

		NSS.alphabette();
		
		NSS.mySubstring("apple", 2, 4);

	}
}
