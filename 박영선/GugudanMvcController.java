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
				throw new IllegalArgumentException("1에서 999단까지만 입력 가능합니다.");
			}
			model.setDan(dan);
			int[] result = model.calculate();
			view.output(result);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요.");
		} /*catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
	}
	
}
