import java.util.Scanner;
import java.io.IOException;

public class View { // �Է¹� ��� ȭ�� ǥ��
	public void Screen() {
		while (true) { // ���� ������ ���α׷� ���� ���ñ��� �����
			Scanner scan = new Scanner(System.in);
			System.out.println("�������α׷��� �Է� �Ͻʽÿ� :  (������ 1, ���� 2)");
			String num = scan.next();
			if (num.equals("1")) { // 1�Ͻ� ������ ���α׷� ����
				System.out.println("������ ���α׷� �Դϴ�.\n");
				System.out.println("���ϴ� ���� �Է��Ͻʽÿ�");
				String number = scan.next();
				if (GugudanisInteger(number)) { // ���� ���� �Ǵ��� �ùٸ��� ���α׷� ����
					GuGuDan guguDan = new GuGuDan();
					guguDan.setNumber(number);
				}
			} else if (num.equals("2")) {//2�Ͻ� ���� ���α׷� ����
				System.out.println("���� ���α׷��Դϴ�.(������ �����մϴ�.)\n");
				System.out.println("ù��° ���ڸ� �Է� �Ͻʽÿ�");
				String number1 = scan.next();
				System.out.println("���ϴ� ���� �Ͻʽÿ�(/,*,-,+)");
				String sign = scan.next();
				System.out.println("�ι�° ���ڸ� �Է� �Ͻʽÿ�");
				String number2 = scan.next();
				if (CalcultorisInteger2(number1, number2)) { // �Է¹��� �� ���ڰ� ���� ���� �Ǵ��� �ùٸ��� ���α׷� ����
					Calcultor Calcultor = new Calcultor();
					Calcultor.calculate(number1, sign, number2);//����
					System.out.println(number1 + sign + number2+'='+Calcultor.getResult());//�Է¹��� ���� ���� ���
				}
			} else { // ���α׷� ������ �ùٸ��� ������ ���
				System.out.println("����� �� ������ ���� �����̽��ϴ�.");
			}
			System.out.println("�ٽ� �����Ͻðڽ���? (���Ḧ ���ҽ� n�� �Է��Ͻʽÿ�)");
			String check = scan.next();
			Re re = new Re();
			re.retry(check);//���α׷� ���� Ȯ��
		}
	}

	public static boolean GugudanisInteger(String judgment) { //������ �Է��� �� ���ڰ� �������� �Ǵ�
		try {
			Integer.parseInt(judgment);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
			return false;
		}
	}

	public static boolean CalcultorisInteger2(String judgment0, String judgment2) { //���� �Է��� �� ���ڰ� �������� �Ǵ�
		try {
			Integer.parseInt(judgment0);
			Integer.parseInt(judgment2);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�ùٸ� ���ڰ� �ƴմϴ�.");
			return false;
		}
	}
}