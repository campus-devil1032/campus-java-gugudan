import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���Ͻô� ���� �Է����ּ���");
		String a = sc.next(); // �� �Է�
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
			System.out.println("�����Է¿���! ���ڸ� �Է����ּ���");
		} finally {
			System.out.println("����");
		}

		sc.close();
	}

}
