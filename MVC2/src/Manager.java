
/**
 * ���� ���� �����Դϴ�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	// ������ ����
	public void service1() {
		Scanner sc = new Scanner(System.in);
		
		int dan = 0;

		while (true) {
			try {
				System.out.println("������ �ܼ��� �Է����ּ��� : ");
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

	
	
	// ���� ����
	public void service2() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("���񽺸� �غ� ���Դϴ�.");
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.���ϱ�");
			System.out.println("4.������");
			System.out.println("0.����");

			num = sc.nextInt();
			if (num == 0) {
				System.out.println("���⸦ �����մϴ�.");
				break;
			} else if (num > 4) {
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�.");
				continue;
			}
		}
	}
}
