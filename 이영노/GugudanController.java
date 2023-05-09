import java.util.Scanner;

public class GugudanController {
	private Gugudan model;
	private GugudanView view;
	private int GugudanConNum;
	String stInput;

	public GugudanController(Gugudan model, GugudanView view) {
			try {
			Scanner scan = new Scanner(System.in);
			System.out.println("구구단 단수를 입력하세요 : ");
			stInput = scan.next();
			this.GugudanConNum = Integer.parseInt(stInput);
			this.model = model;
			this.view = view;
			} catch (RuntimeException e){
			System.out.println(e.getMessage());
			}
		
	}

	public int getGugudanConNum() {
		return model.getGugudanConNum();
	}

	public void setGugudanConNum() {

		model.setGugudanConNum(GugudanConNum);

	}

	public void updateView() {
		view.createGugudanMVC(model.getGugudanConNum());
	}

}
