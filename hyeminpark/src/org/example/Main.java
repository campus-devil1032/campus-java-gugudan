package org.example;

public class Main {

	public static void main(String[] args) {
		/**
		 * 자동차 구매 프로세스 시작
		 */
		
		Car carObject = new Car(1000, "ModelY");
		carObject.setFactoryName("123");
		System.out.println(carObject.getFactoryName());
		
		/**
		 * 자동차 구매 프로세스 종료
		 */

	}

}
