import java.util.Scanner;
import java.io.IOException;

public class View {


		public void Screen(){
		while (true) {														//���� ������ ���α׷� ���� ���ñ��� �����
			Scanner scan = new Scanner(System.in);
			System.out.println("�������α׷��� �Է� �Ͻʽÿ� :  (������ 1, ���� 2)");
			String num = scan.next();
			if (num.equals("1")) {											// 1�Ͻ� ������ ���α׷� ����
				System.out.println("������ ���α׷� �Դϴ�.\n");
				System.out.println("���ϴ� ���� �Է��Ͻʽÿ�");
				String number = scan.next();
				if (isInteger(number)) { 									//���� ���� �Ǵ��� �ùٸ��� ���α׷� ����
					GuGuDan GuGuDan = new GuGuDan(number);
					GuGuDan.test();
				}
			} else if (num.equals("2")) {
				System.out.println("���� ���α׷��Դϴ�.(������ �����մϴ�.)\n");
				System.out.println("ù��° ���ڸ� �Է� �Ͻʽÿ�");
				String number1 = scan.next();
				System.out.println("���ϴ� ���� �Ͻʽÿ�(/,*,-,+)");
				String sign = scan.next();
				System.out.println("�ι�° ���ڸ� �Է� �Ͻʽÿ�");
				String number2 = scan.next();
				if (isInteger2(number1, number2)) {							//�Է¹��� �� ���ڰ� ���� ���� �Ǵ��� �ùٸ��� ���α׷� ����
					Calcultor Calcultor = new Calcultor(number1, sign, number2);
					Calcultor.calculate();									//�Է¹��� sign�� �ùٸ� ��ȣ�̸� �Է��ѽİ� ���� ���
				}
			} else {														//���α׷� ������ �ùٸ��� ������ ���
				System.out.println("����� �� ������ ���� �����̽��ϴ�.");
			}
			System.out.println("�ٽ� �����Ͻðڽ���? (���Ḧ ���ҽ� n�� �Է��Ͻʽÿ�)");
			String check = scan.next();
			Re Re = new Re(check);
			Re.retry();
		}
	}

	public static boolean isInteger(String judgment) { 						//�Է��� ���ڰ� �������� �Ǵ�
		try {
			Integer.parseInt(judgment);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			return false;
		}
	}

	public static boolean isInteger2(String judgment1, String judgment2) { 	 // �Է��� �� ���ڰ� �������� �Ǵ�
		try {
			Integer.parseInt(judgment1);
			Integer.parseInt(judgment2);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ���ڰ� �ƴմϴ�.");
			return false;
		}
	}
}