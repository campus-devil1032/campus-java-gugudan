
/**
 * ���� ���� �����Դϴ�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	/**
	 * ������ ���� 
	 * 1. �������� ���� �Է¹޴´� 
	 * 2. ���� 1~999�� ������ �Է��� �� �ִ�. 
	 * 3. �� ���� ������ �Է��� ��� ����ó�� throw new 
	 * 4. 1~9���� ���ϴ� �������� ����Ѵ�.
	 */
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;

		while (true) {
			try {
				System.out.println("=======������=======");
				System.out.println("������ �ܼ��� �Է����ּ��� : ");
				
				// ���� �Է¹޽��ϴ�.
				dan = sc.nextInt();

				if (dan < 1 || dan > 999) { // 1~999������ �ܸ� ��� �����մϴ�
					// �߸��� �μ� �Է� ����
					throw new IllegalArgumentException("1~999 ������ ������ �Է����ּ���.");
				} 
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("�Է¿���! 1~999 ������ �������� �Է����ּ���.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		// 1~9���� ���ϴ� �������� ����մϴ�
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
	}

	/**
	 * ���� ���� 
	 * 1. ���� �޴� ���� 
	 * 2. �������� �޴� ��ȣ�� �Է¹޴´� 
	 * 3. �� ��ȣ�� ���� ����� �����Ѵ�
	 */
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			// ���� �޴� ����
			System.out.println("=======����=======");
			System.out.println("=======Menu=======");
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.���ϱ�");
			System.out.println("4.������");
			System.out.println("0.����");

			num = sc.nextInt();
			if (num == 0) {
				System.out.println("���⸦ �����մϴ�.");
				break;
			} else if (num > 4) { // ���� ��ȣ�� �Է����� ��
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�.");
				continue;
			}

			// ���� 2���� ���� ��� ���
			System.out.println("ù ���� ���ڸ� �Է��ϰ�, ���͸� ��������");
			int num1 = sc.nextInt();
			System.out.println("�� ���� ���ڸ� �Է��ϰ�, ���͸� ��������");
			int num2 = sc.nextInt();

			if (num == 1) { // ���ϱ�
				int result1 = num1 + num2;
				System.out.println("���ϱ� ��� : " + result1);
				break;
			}
			if (num == 2) { // ����
				int result2 = num1 - num2;
				System.out.println("���� ��� : " + result2);
				break;
			}
			if (num == 3) { // ���ϱ�
				int result3 = num1 * num2;
				System.out.println("���ϱ� ��� : " + result3);
				break;
			}
			if (num == 4) { // ������
				int result4 = num1 / num2;
				System.out.println("�������� �� : " + result4);
				int result5 = num1 % num2;
				System.out.println("�������� ������ : " + result5);
				break;
			}
		}
	}
}
