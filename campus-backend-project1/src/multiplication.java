import java.util.Scanner;
import java.io.IOException;

public class multiplication {

	public static void main(String[] args) {
		view();
		// �������� ��� �Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
	}

	static void view() {
		boolean retry = true;// ���α׷� �ٽ� ������ ���� ��
		while (retry) {
			Scanner number = new Scanner(System.in);
			System.out.println("���ϴ� �������� ���� �Է��Ͻʽÿ�. ");
			String num = number.next();
			if(test(num)) { // �Ǽ� �����Ǵ�
				int i =Integer.parseInt(num);
				if (0 < i && i < 999)// 0���� 999���� ���ڸ� �Է�
				{
					for (int j = 1; j < 10; j++) {
						System.out.println(num + "*" + j + "=" + j * i); // ������ ���
					}
				} else {
					System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�.");
				}
			}
			System.out.println("�ٽ� �����Ͻðڽ���? (���Ḧ ���ҽ� n�� �Է��Ͻʽÿ�)");
			String check = number.next();
			if (check.equals("n"))// �Է� ���ڰ� n�̸� retry �� ����
			{
				retry = false;
			}
		}
		System.out.println("������ ���α׷� ����");
		System.exit(0);
	}

	public static boolean test(String s) { //�Ǽ� ���� �Ǵ�
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			return false;
		}
	}
}