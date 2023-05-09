package org.example;


public class Car {
	
	/**
	 * 색 제조사 이름 생산년월 ... .. ..
	 */
	
	private int money;
	private String carModel;
	private String factoryName;

	public String factoryNamePostProcess() {
		return "[인증완료] " + factoryName;
	}
	
	public Car(int money, String carModel) {
		this.money = money;
		this.carModel = carModel;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String getFactoryName() {
		return "[인증완료]" + factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

}
