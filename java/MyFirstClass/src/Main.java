import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Model model = Model.getInstance();
		View view = new View();
		Controller controller = new Controller();
		
		view.inPutView(model);
		
		controller.isValid(model);
			
		view.outPutView(model);

		
		
	}
}