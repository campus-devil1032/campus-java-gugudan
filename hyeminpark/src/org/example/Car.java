package org.example;


public class Car {
	
	/**
	 * �� ������ �̸� ������ ... .. ..
	 */
	
	private int money;
	private String carModel;
	private String factoryName;

	public String factoryNamePostProcess() {
		return "[�����Ϸ�] " + factoryName;
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
		return "[�����Ϸ�]" + factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

}
