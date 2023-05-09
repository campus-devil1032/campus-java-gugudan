package GugudanMVC;

public class Controller {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void showTable(int num) {
		model = new Model(num);
		String table = model.getTable();
		view.displayTable(table);
	}

}
