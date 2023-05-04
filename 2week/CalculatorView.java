package homework;

public class CalculatorView {
	CalculatorModel model;
	public CalculatorView(CalculatorModel model) {
		this.model = model;
	}
	public void viewResult() {
		System.out.printf("%d %s %d = %d",model.a,model.operator,model.b,model.result);
		System.out.println();
	}
}
