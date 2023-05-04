package homework;

public class CalculatorView {
	CalculatorModel model;
	public CalculatorView(CalculatorModel model) {
		this.model = model;
	}
	public void viewResult() {		//연산 결과값을 보여주는 메서드
		System.out.printf("%d %s %d = %d",model.a,model.operatorValue,model.b,model.result);
		System.out.println();
	}
}