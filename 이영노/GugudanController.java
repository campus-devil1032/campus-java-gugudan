
public class GugudanController {

	private GugudanModel model;
	private GugudanView view;
	
	public GugudanController(GugudanModel model, GugudanView view) {
		this.model = model;
		this.view = view;
		
	}
	public int getModel() {
		return model.getNumberGuGudan();
	}
	public void setModel(int num) {
		model.setNumberGuGudan(num);
	}
	
	public void setView() {
		view.printGugudan(model.getNumberGuGudan());
	}
	
}
