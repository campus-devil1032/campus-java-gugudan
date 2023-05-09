package calculator05_09;

import java.util.Scanner;

/*시나리오
 1. 뷰단에서 액션 받음 ( 하나의 문자열로 받음)  ex) 1 + 10 * 20 + 30
  공백을 기준으로 숫자와 연산식이 번갈아 나와야만 한다. <- 이것을 검증하는 함수가 필요하다.validateUserInput
 2.결과 값을 콘솔로 보여준다.


조건
1.연산은 사칙 연산만 한다.
2.문자열의 입력 순서만 추종 ( 실제 수학 연산우선순위가 적용 안됨 .곱셈이 먼저 나눗셈이 먼저 배제


클래스
main
계산기 클래스
-사칙연산한다
-유저에게입력받는다
-검증을한다
-출력을한다.


 */
class IndexView{
	private String inputString;

	IndexView(){
		System.out.println("계산기 프로그램입니다.");
		System.out.println("ex) \"1 + 10 * 20 + 30\" 식을 넣어주세요.");
		Scanner sc = new Scanner(System.in);
		inputString=sc.nextLine();
	}
	
	public String getInputString() {
		return inputString;
	}
}
class OutputView{
	void OutputView(int output){
		System.out.println("계산이 완료 되었습니다.");
		System.out.println("값은"+ output+"입니다");
	}
}
class Calculator{
	Validation validation;
	Calculation calculation;
	int result;
	
	public Calculator(Validation validation , Calculation calculation) {
		this.validation=validation;
		this.calculation=calculation;
	}
	public void Function(String inputString){
		if((validation.isExpressionValidate(inputString) )
				&& (validation.isNumericValidate(inputString.split(" ")))) {
			calculation.calculate(inputString.split(" "));
			result=calculation.result;
		}
	}
	public int getResult() {
		return result;
	}
}
class Validation{
	boolean isExpressionValidate(String inputString) {
		String [] arrayInputString = inputString.split(" ");
		if(arrayInputString.length%2==1) {
			return true;
		}else {
			return false;
		}
	}
	boolean isNumericValidate(String [] arrayInputString) {
		try {
			for(int i=0;i<arrayInputString.length;i+=2) {
				Integer.parseInt(arrayInputString[i]);
			}
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}

class Calculation{
	int result;
	public void calculate(String [] arrayInputString){
			result = Integer.parseInt(arrayInputString[0]);
		
		for(int i=1;i<arrayInputString.length;i+=2) {
			if(arrayInputString[i].equals("+")){
				result+=Integer.parseInt(arrayInputString[i+1]);
			}
			if(arrayInputString[i].equals("-")){
				result-=Integer.parseInt(arrayInputString[i+1]);
			}
			if(arrayInputString[i].equals("*")){
				result*=Integer.parseInt(arrayInputString[i+1]);
			}
			if(arrayInputString[i].equals("/")){
				result/=Integer.parseInt(arrayInputString[i+1]);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		IndexView indexView = new IndexView();
		OutputView outputView = new OutputView();
		Validation validation =new Validation();
		Calculation calculation = new Calculation();
		Calculator calculator = new Calculator(validation,calculation);
		
		
		calculator.Function(indexView.getInputString());
		outputView.OutputView(calculation.result);
	}
}
