package campus_project_0502;

public class gugudan {
	public static void main(String[] args) {
		// for (�ʱⰪ; ���Ῡ��; ������), 1�ܺ��� ����, �ݺ��� 1�� ���� 1�� ����.
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "���� ��� �մϴ�.");

			// j�� i�� �����ִ� ��. 9���� ���ϰ� �� �� i+1�� ���� �ٽ� 1-9���� ����.
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
