
public class GuGuDan  { // ������ ��� class
	private String number;

	GuGuDan(String number) {
		this.number = number;
	}

	public void test() {
		int i = Integer.parseInt(number);
		if (0 < i && i <= 999)// 0���� 999���� ���ڸ� �Է�
		{
			for (int j = 1; j < 10; j++) {
				System.out.println("	" + i + "*" + j + "=" +(i*j)); // ������ ���
			}
		} else {
			System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�.");
		}
	}
}