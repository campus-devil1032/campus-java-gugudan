
/**
 * ����ȭ��
 */

import java.util.Scanner;

public class MainWin {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==========Menu==========");
			System.out.println("1. ������");
			System.out.println("2. ����");
			System.out.println("3. ���α׷�����");
			System.out.println("���� : ");

			int choice = sc.nextInt();
			if (choice == 1) {
				manager.service1();
				break;
			} else if (choice == 2) {
				manager.service2();
				break;
			} else if (choice == 3) {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}
}
