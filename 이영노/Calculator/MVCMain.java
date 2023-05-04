import java.io.IOException;
import java.util.Scanner;

public class MVCMain {
	public static void main(String[] args) throws IOException {

		CalculatorModel model = CalculatorfromMVC();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.updateView();
		
	}
	
	
	public static CalculatorModel CalculatorfromMVC() throws IOException {
		CalculatorModel calculator = new CalculatorModel();
		return calculator;
	}
}
