package GugudanMVC;

public class Main {

	public static void main(String[] args) {
		
		Model model = new Model(2);
		View view = new View(new Controller(model, new View(new Controller(model, null))));
		view.run();

	}

}
