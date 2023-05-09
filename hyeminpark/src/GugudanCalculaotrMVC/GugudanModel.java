package GugudanCalculaotrMVC;

/**
 * 
 * ������ ��� �� :
 * �Է��� �� ���� �������� ��µ˴ϴ�.
 * 
 * @author shmty
 *
 */

public class GugudanModel {
	
	private int num;

	public GugudanModel(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getTable() {
		StringBuilder sb = new StringBuilder();
		System.out.println("*****" + num + "��*****");
		for (int i = 1; i <= 9; i++) {
			sb.append(num)			// �Է��� �� ��
				.append(" x ")		// ���ϱ�
				.append(i)			// 1~9���� �ݺ��ϴ� �κ�
				.append(" = ")		// ��ȣ
				.append(num * i)	// �ܼ� * i�� �����
				.append("\n");		// �ٹٲ�
		}
		return sb.toString();
	}
}
