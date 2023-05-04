import java.util.Scanner;

public class GugudanController {

	private GugudanModel model;
	private GugudanView view;
	
	public GugudanController(GugudanModel model, GugudanView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getAnswer() {
		return model.getAnswer();
	}
	
	public void setAnswer(int answer) {
		
		model.setAnswer(answer);
	}
	
	
	public void updateView() {
		view.updateView(model.getAnswer());
	}
	
	
	
	
}
