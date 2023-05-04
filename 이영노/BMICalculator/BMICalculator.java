import java.util.Scanner;

public class BMICalculator {

	private double Total;

	
	public BMICalculator() {
		try {
		System.out.println("BMI 계산기입니다.");
		Scanner scan = new Scanner(System.in);

		System.out.println("당신의 키를 입력하세요 (예 170cm = 1.7): ");
		String height = scan.next();
		Double dobHeight = Double.parseDouble(height);
		System.out.println(dobHeight);

		System.out.println("당신의 몸무게를 입력하세요: ");
		String kg = scan.next();
		Double dobKG = Double.parseDouble(kg);
		System.out.println(dobKG);

		double total;
		// 계산방법 : 체중(kg) ÷ {신장(m) × 신장(m)}.
		total = dobKG / (dobHeight * dobHeight);
		this.Total = total;
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}
		
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

}
