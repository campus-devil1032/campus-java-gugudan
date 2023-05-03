import java.util.Scanner;
import java.io.IOException;

class Gugudan { // ������ ��� class
	String number;

	Gugudan(String number) {
		this.number = number;
	}

	public void Gugudan() {
		int i = Integer.parseInt(number);
		if (0 < i && i < 999)// 0���� 999���� ���ڸ� �Է�
		{
			for (int j = 1; j < 10; j++) {
				System.out.println("	"+number + "*" + j + "=" + j * i); // ������ ���
			}
		} else {
			System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�.");
		}
	}
}

public class multiplication {

	public static void main(String[] args) {
		view();
		// �������� ��� �Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
	}

	static void view() {
		boolean retry = true;// ���α׷� �ٽ� ������ ���� ��
		while (retry) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���ϴ� �������� ���� �Է��Ͻʽÿ�. ");
			String num = scan.next();
			if (test(num)) { // �Ǽ� �����Ǵ�
				Gugudan Gugudan = new Gugudan(num);
				Gugudan.Gugudan();
			}
			System.out.println("�ٽ� �����Ͻðڽ���? (���Ḧ ���ҽ� n�� �Է��Ͻʽÿ�)");
			String check = scan.next();
			if (check.equals("n"))// �Է� ���ڰ� n�̸� retry �� ����
			{
				retry = false;
			}
		}
		System.out.println("������ ���α׷� ����");
		System.exit(0);// ���α׷� ����
	}

	public static boolean test(String s) { // �Ǽ� ���� �Ǵ�
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			return false;
		}
	}
}