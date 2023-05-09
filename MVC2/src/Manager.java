
/**
 * ���� ���� �����Դϴ�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	// ������ ����
	public void service1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ܼ��� �Է����ּ��� : ");
		int dan = 0;

		while (true) {
			try {
				// ���� �Է¹޽��ϴ�.
				dan = sc.nextInt();
				// 1~999������ �ܸ� ��� �����մϴ�
				if (dan < 1 || dan > 999) {
					// �߸��� �μ� �Է� ����
					throw new IllegalArgumentException("1~999 ������ ������ �Է����ּ���.");
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("�Է¿���! 1~999 ������ �������� �Է����ּ���.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		// 1~9���� ���ϴ� �������� ����մϴ�
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
	}

	public void service2() {
		System.out.println("���� ���񽺰� �������� �ʽ��ϴ�.");
	}
}
