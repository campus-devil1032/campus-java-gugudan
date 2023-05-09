package gugudanMVC;

import java.util.Scanner;

public class gugudanController {
	private Scanner sc;
	private gugudanModel model;
	
	public gugudanController() {				//sc,모델 생성
		sc = new Scanner(System.in);
		model = new gugudanModel();
	}
	
	public int InputUserDan() throws InvalidDanException {
			model.setDan(sc.nextInt());					//사용자에게서 받은 숫자를 model의 변수로 설정
			return model.getDan();						
	}

}
