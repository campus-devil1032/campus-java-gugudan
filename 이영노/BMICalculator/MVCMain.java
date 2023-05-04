import java.util.Scanner;

public class MVCMain {
	public static void main(String[] args) {
		BMICalculator model = MVCCalcfromMVC();
		BMICalcView view = new BMICalcView();
		BMICalcController controller = new BMICalcController(model, view);
		controller.updateView();
		
		
		
	}
	
	public static BMICalculator MVCCalcfromMVC() {
		BMICalculator bmi = new BMICalculator();
		
		return bmi;
	}
}
