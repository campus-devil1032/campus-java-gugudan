import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code2 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���Ͻô� ���� �Է����ּ���");

		String a = null; // ���� scanner�� �޸� buffer�� �ʱ�ȭ ������� ���� �߻�..
		try {
			a = br.readLine();
		} catch (IOException e1) {

			e1.printStackTrace();
			// logger.error("Error test!!", e1);
			// ToDo : stacktrace���� ������ logger�� ����Ұ� (���⼱ �����ӿ�ũ �߰��� �ʿ�..)
		}

		int b, c; // b-���� , c-���

		try {
			b = Integer.valueOf(a);
			if (b < 1000) {
				System.out.println("�Է��Ͻ��� ����" + a + "�� �Դϴ�");
				for (int i = 1; i < 10; i++) {
					c = b * i;
					System.out.println(a + "x" + i + "=" + c);
				}
			} else {
				System.out.println("��������! 1000 ���Ϸ� �Է����ּ���");
			}

		} catch (NumberFormatException e) {
			b = 0; // ���ڷ� ��ȯ�Ҽ� ���� ���ڿ� �����̸� 0���� �ʱ�ȭ
			System.out.println("�����Է¿���! ������ �Է����ּ���");
		}
		System.out.println("����");
	}

}
