/**
 * ���� ���� �����Դϴ�.
 */
import java.util.Scanner;

public class Manager {

	public void service1() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;

		while (true) {
			try {
				System.out.println("������ �ܼ��� �Է����ּ��� : ");
				dan = sc.nextInt();
				if (dan >= 1 && dan <= 999) {
					for (int i = 1; i < 10; i++) {
						System.out.println(dan + "X" + i + "=" + dan * i);
					}
					break;
				} else {
					System.out.println("�Է¿���!");
				}
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("1~999 ������ ������ �Է����ּ���.");

			}
		}

	}

	public void service2() {
		System.out.println("���� ���񽺰� �������� �ʽ��ϴ�.");
	}
}
