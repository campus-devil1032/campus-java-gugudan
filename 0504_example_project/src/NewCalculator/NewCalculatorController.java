package NewCalculator;

import java.util.Scanner;

public class NewCalculatorController {
	private NewCalculatorModel model;
	private NewCalculatorView view;

	public NewCalculatorController(NewCalculatorModel model, NewCalculatorView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				view.inputFirstNum();
				int firstNum = sc.nextInt();
				model.setFirstNum(firstNum);

				view.inputOperator();
				String operator = sc.next();
				model.setOperator(operator);

				view.inputSecondNum();
				int secondNum = sc.nextInt();
				model.setSecondNum(secondNum);

				int result = model.calculate();
				view.printCalculationResult(result);

			} catch (Exception e) {
				view.errorMessage();
			}
		}
	}
}
