package gugudanMVC;

import java.util.Scanner;

public class gugudanController {
	private Scanner sc;
	private gugudanModel model;
	
	public gugudanController() {
		sc = new Scanner(System.in);
		model = new gugudanModel();
	}
	
	public int InputUserDan() throws InvalidDanException {
			int dan = sc.nextInt();
			model.setDan(dan);	
			return model.getDan();
	}

}
