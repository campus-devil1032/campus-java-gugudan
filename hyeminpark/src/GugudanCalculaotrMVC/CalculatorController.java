package GugudanCalculaotrMVC;

public class CalculatorController {

	private CalculatorModel model;
	private CalculatorView view;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void showTable() {
		double num1 = view.getInputNum1();
		String operator = view.getInputOperator();
		double num2 = view.getInputNum2();
		double result = model.calculate(num1, num2, operator);
		view.printResult(result);
	}

}
