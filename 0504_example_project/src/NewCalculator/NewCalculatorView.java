package NewCalculator;


public class NewCalculatorView {
	
    public void inputFirstNum() {
        System.out.printf("첫번째 숫자를 입력하세요 ");
    }

    public void inputOperator() {
        System.out.println("연산자를 입력하세요. [ +, -, *, / ] ");
    }

    public void inputSecondNum() {
        System.out.println("두번째 숫자를 입력하세요 ");
    }

    public void printCalculationResult(int result) {
        System.out.println("결과 : " + result);
    }

    public void printContinueOrExitMessage() {
        System.out.println("종료를 원하시면 [안녕] 을 입력해주세요");
    }

    public void printErrorMessage(String message) {
        System.out.println(message+"\n");
    }
    
	public void errorMessage () {
		System.out.println("바보!");
	}

}
