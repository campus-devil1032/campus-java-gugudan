
public class GuGuDan { // ������ ���
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		
	 }

	public void test(String number) {
		int i = Integer.parseInt(number);								//�Է���  String�� int�� ��ȯ
		if (0 < i && i <= 999)											// 0���� 999���� ���ڸ� �Է�
		{
			for (int j = 1; j < 10; j++) {
				System.out.println("	" + i + "*" + j + "=" +(i*j)); 	// ������ ���
			}
		} else {
			System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�.");			//���ڰ� ���� �� �϶� ���
		}
	}
}