package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator_Controller {	//controller
	Calculator_Model model;
	Calculator_View view;
	public void inputData() throws IOException {
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("구구단을 출력합니다. 원하는 단수를 입력해주세요. (종료:q)");
			String input = br.readLine();
			
			if(input.equals("q")) 
				break;
			
			model = new Calculator_Model(input);
			
			if(!model.isValidDan()) 
				continue;
			view = new Calculator_View(model);
			view.viewResult();
		}
	}
}
