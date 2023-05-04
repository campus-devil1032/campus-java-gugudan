import java.util.Scanner;

public class MVCMain {
	public static void main(String[] args) {

		GugudanModel model = retriveGugudanFromDatabase();
		GugudanView view = new GugudanView();
		GugudanController controller = new GugudanController(model, view);
		controller.updateView();
	}

	
	
	public static GugudanModel retriveGugudanFromDatabase() {
		GugudanModel GugudanModel = new GugudanModel();
		
		return GugudanModel;
		
	}
	
	
}
