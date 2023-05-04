import java.util.Scanner;

public class CalculatorModel {

	private double firstaNumber;
	private double secondNumber;
	private String operator;
	private double answerNumber;
	
	CalculatorModel() {
		Scanner scan = new Scanner(System.in);

		System.out.println("계산할 첫번째 숫자를 입력하세요: ");
		String inputNumberOne = scan.next();
		double intnumberOne = Integer.parseInt(inputNumberOne);
		System.out.println(intnumberOne);

		System.out.println("계산에 적용할 수식 * / + - 를 입력하세요: ");
		String inputOperator = scan.next();
		System.out.println(inputOperator);

		System.out.println("계산할 두번째 숫자를 입력하세요: ");
		String inputNumberTwo = scan.next();
		double intnumberTwo = Integer.parseInt(inputNumberTwo);
		System.out.println(intnumberTwo);
		
		double answer = 0;
		switch (inputOperator) {
		case "+":
			answer = intnumberOne + intnumberTwo;
			break;

		case "*":
			answer = intnumberOne * intnumberTwo;
			break;
		case "-":
			answer = intnumberOne - intnumberTwo;
			break;
		case "/":
			answer = intnumberOne / intnumberTwo;
			break;
			
		default:
			break;
		}
		
		this.firstaNumber = intnumberOne;
		this.secondNumber = intnumberTwo;
		this.operator = inputOperator;
		this.answerNumber = answer;
		
	}
	
	public double getFirstaNumber() {
		return firstaNumber;
	}
	public void setFirstaNumber(double firstaNumber) {
		this.firstaNumber = firstaNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public double getAnswerNumber() {
		return answerNumber;
	}
	
	public void setAnswerNumber(double answer) {
		this.answerNumber = answer;
	}
	
	
	
	
	
	
	
}
