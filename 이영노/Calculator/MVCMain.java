import java.util.Scanner;

public class MVCMain {
	public static void main(String[] args) {

		CalculatorModel model = CalculatorfromMVC();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.updateView();
		
	}
	
	
	public static CalculatorModel CalculatorfromMVC() {
		CalculatorModel calculator = new CalculatorModel();
		return calculator;
	}
}
