package gugudanMVC;

public class gugudanView {
	private gugudanController controller;
	
	public gugudanView(){
		controller = new gugudanController();			//��Ʈ�ѷ� ��ü ����
	}
	
	public void printUserDan() throws InvalidDanException {
		try {																		//����ڿ��Լ� ���� ���� ���
			System.out.println("Enter a number");
			int dan = controller.InputUserDan();
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d", dan, i, dan*i).println();
			}
		}catch(InvalidDanException e) {			//���� ���� ��, ������ �Ѿ�ԵǸ� ����ó��
			System.out.println(e);
		}
	}
}
