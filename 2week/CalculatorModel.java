package homework;

public class CalculatorModel {
	int a;				// 첫번째 값
	int b;				// 두번째 값
	int result;		// 결과 값
	String operator;	// 연산자 
	public CalculatorModel(String input) {	
		String[] number = input.split(" ");
		a = Integer.parseInt(number[0]);	//메인에 에러를 떠넘겨나서 별도로 정의할 필요 없음
		b = Integer.parseInt(number[1]);
	}
	
	public void addValue() {	//더하기
		result = a+b;
		operator="+";
	}
	public void minusValue() {//빼기
		result = a-b;
		operator="-";
	}
	public void timesValue() {//곱하기
		result = a*b;
		operator="*";
	}
	public void divideValue() {//나누기(나머지구현X)
		result = a-b;
		operator="/";
	}
}
