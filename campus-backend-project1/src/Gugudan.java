public class GuGuDan { // ������ ���
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		int num = Integer.parseInt(number); // �Է��� String�� int�� ��ȯ
		if (0 < num && num <= 999) // 0���� 999���� ���ڸ� �Է�
		{
			for (int dan = 1; dan < 10; dan++) {
				System.out.println("	" + num + "*" + dan + "=" + (num * dan)); // ������ ���
			}
		} else {
			System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�."); // ���ڰ� ���� �� �϶� ���
		}
	}
}