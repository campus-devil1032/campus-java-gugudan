package mvc111;

//��,��Ʈ�ѷ�,�� ������ �ۼ��Ұ�
//������ ���� �� �̿� ���õ� �� ����, ����, ��� (���� ���ϰ� ����� view�ܿ��� ����)
//�⺻���� ���� ���� ������ ���⿡ ����ȴ�.
public class Model_Test {

	private int num; // �Էµ� ���� �����

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void showTable(int num) {
		// model_Test = new Model_Test();
		// model_Test.setNum(num);
		try {
			if (num < 1000) {
				System.out.println("�Է��Ͻ��� ����" + num + "�� �Դϴ�");
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "x" + i + "=" + num * i);
				}
			} else {
				System.out.println("��������! 1000 ���Ϸ� �Է����ּ���");
			}

		} catch (NumberFormatException e) {
			num = 0; // ���ڷ� ��ȯ�Ҽ� ���� ���ڿ� �����̸� 0���� �ʱ�ȭ
			System.out.println("�����Է¿���! ������ �Է����ּ���");
		}
	}
}