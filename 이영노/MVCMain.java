import java.util.Scanner;

public class MVCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan model = ModelGugudan();
		GugudanView view = new GugudanView();
		GugudanController controller = new GugudanController(model, view);
		
		controller.setGugudanConNum();
		controller.updateView();
		
		
		
	}
	
	
	public static Gugudan ModelGugudan() {
		Gugudan calculator = new Gugudan();
		return calculator;
	}

}
