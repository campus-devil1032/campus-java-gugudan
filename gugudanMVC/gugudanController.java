package gugudanMVC;

import java.util.Scanner;

public class gugudanController {
	private Scanner sc;
	private gugudanModel model;
	
	public gugudanController() {				//sc,�� ����
		sc = new Scanner(System.in);
		model = new gugudanModel();
	}
	
	public int InputUserDan() throws InvalidDanException {
			model.setDan(sc.nextInt());					//����ڿ��Լ� ���� ���ڸ� model�� ������ ����
			return model.getDan();						
	}

}
