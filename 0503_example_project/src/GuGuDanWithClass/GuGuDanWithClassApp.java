
package GuGuDanWithClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GuGuDanWithClassApp {
	public static void main(String[] args) throws IOException {

		System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
		
		GuGuDanWithClassModel model = new GuGuDanWithClassModel();
		GuGuDanWithClassView view = new GuGuDanWithClassView();
		GuGuDanWithClassController controller = new GuGuDanWithClassController(model, view);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		controller.setDan(input);
		controller.updateView();
	}

}
	