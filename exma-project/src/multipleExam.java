import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExam { // ������ ��� ����
	public static void main(String[] args) {
		while (true) {
			int input = 0;
			System.out.println("1 : ������, 2 : ����, 3: ����");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			Scanner sc = new Scanner(System.in); // ����ڰ� �Է��� ���ڸ� �޴� ���� ����� 1������ import�� �ʿ�
			input = sc.nextInt();
			if (input == 1) {
				System.out.print("1~999������ ���ڸ� �Է����ּ��� : ");
				int num1 = 0; // num1 ���� �ʱ�ȭ

				// try-catch������ ����ó���ϱ� : ���ڰ� �ƴ� ���ڸ� �Է¹��� ��� ���α׷� ����
				try {
					num1 = sc.nextInt(); // �Է¹��� ������ int�� ������ �����Ѵ�.
					if ((num1 > 999) || (num1 < 1)) // 1~999 ������ �Ѿ�� ���� �߻� �� ���� ó��
						System.out.println("������ ������ ���� �ʽ��ϴ�. 1~999������ ���ڸ� �Է����ּ���");
					else {
						for (int i = 1; i <= 9; i++) { // ������ ������ ��ġ�� ��� ������ ���
							System.out.println(num1 + " * " + i + " = " + num1 * i);
						}
					}
				} catch (InputMismatchException e) {
					// �Է¹��� ������ Ÿ�԰� ������ ������ Ÿ���� ���� ���� ��� �߻��ϴ� exception
					System.out.println("���ڰ� �ƴմϴ�. ���α׷��� �����մϴ�.");
				}
			} else if (input == 2) { // ����
				System.out.println("���� 2���� �Է����ּ��� : ");
				int cNum1 = sc.nextInt();
				int cNum2 = sc.nextInt();
				int res = 0;

				System.out.println("���ϰ��� �ϴ� ������ �Է����ּ��� : ");
				char cal;
				cal = sc.next().charAt(0); // scanner�� ���� �Է¹��� ������ ù��° �ܾ ������ cal������ ����

				if (cal == '+') {
					res = cNum1 + cNum2;
					System.out.println(cNum1 + " + " + cNum2 + " = " + res);
				} else if (cal == '-') {
					if (cNum1 < cNum2) {
						System.out.println("ù ��° ���� �� ��° ������ �۽��ϴ�. ù ��° ���ڸ� �� ��° ���ں��� ũ�� �Է����ּ���");
					} else {
						res = cNum1 - cNum2;
						System.out.println(cNum1 + " - " + cNum2 + " = " + res);
					}
				} else if (cal == '*') {
					res = cNum1 * cNum2;
					System.out.println(cNum1 + " * " + cNum2 + " = " + res);
				} else if (cal == '/') {
					if (cNum1 == '0') {
						System.out.println("�������� ���ڴ� 0�� �� �� �����ϴ�. �ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
					} else {
						res = cNum1 / cNum2;
						System.out.println(cNum1 + " / " + cNum2 + " = " + res);
					}
				}

			} else if (input == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close(); // OS���� �ڿ��� �ǵ�����
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
			}
		} // while�� ����
	}
}
