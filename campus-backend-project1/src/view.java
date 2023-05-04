import java.util.Scanner;
import java.io.IOException;


public class View {

	public static void main(String[] args) {

		boolean retry = true;// ���α׷� �ٽ� ������ ���� ��
		while (retry) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�������α׷��� �Է� �Ͻʽÿ� :  (������ 1, ���� 2)");
			String num = scan.next();
			if (num.equals("1")) {
				System.out.println("������ ���α׷� �Դϴ�.\n");
				System.out.println("���ϴ� ���� �Է��Ͻʽÿ�");
				String number = scan.next();
				if (test(number)) { // �Ǽ� �����Ǵ�
					Gugudan Gugudan = new Gugudan(number);
					Gugudan.test();
				}
			} else if (num.equals("2")) {
				System.out.println("���� ���α׷��Դϴ�.(������ �����մϴ�.)\n");
				System.out.println("ù��° ���ڸ� �Է� �Ͻʽÿ�");
				String number1 = scan.next();
				System.out.println("���ϴ� ���� �Ͻʽÿ�(/,*,-,+)");
				String sign = scan.next();
				System.out.println("�ι�° ���ڸ� �Է� �Ͻʽÿ�");
				String number2 = scan.next();
				if (test2(number1, number2)) { // ���� �Ǵ�
					Calcultor Calcultor = new Calcultor(number1, sign, number2);
					Calcultor.calculate();
				}
			} else {
				System.out.println("����� �� ������ ���� �����̽��ϴ�.");
			}
			System.out.println("�ٽ� �����Ͻðڽ���? (���Ḧ ���ҽ� n�� �Է��Ͻʽÿ�)");
			String check = scan.next();
			Re Re = new Re(check);
			Re.retry();
		}
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

	public static boolean test2(String s, String a) { // �������� �������� �Ǵ�
		try {
			Integer.parseInt(s);
			Integer.parseInt(a);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ���ڰ� �ƴմϴ�.");
			return false;
		}
	}
}