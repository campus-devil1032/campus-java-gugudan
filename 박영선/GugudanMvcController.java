import java.io.IOException;
import java.util.InputMismatchException;

public class GugudanMvcController {
	private GugudanMvcModel model;
	private GugudanMvcView view;
	
	public GugudanMvcController(GugudanMvcModel model, GugudanMvcView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		try {
			int dan = view.inputDan();
			if(dan<1 || dan>999) {
				throw new IllegalArgumentException("1���� 999�ܱ����� �Է� �����մϴ�.");
			}
			model.setDan(dan);
			int[] result = model.calculate();
			view.output(result);
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���.");
		} /*catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
}
