package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

	
	public static void SelectSwitch(Scanner input,int cal_n1, int cal_n2){
		Menu();
		
		int n = 0;
		
		while(true) {
			n = input.nextInt();
			
			switch(n) {
		
				case 1:
					System.out.println("=====<����>=====");
					System.out.println("�ؼ��� 2���� �Է��ؾ��մϴ�.");
					CalView(input, cal_n1, cal_n2);
					Menu();
					break;
				case 2:
					System.out.println("=====<������>======");
					System.out.println("1 ~ 999������ ���� �Է����ּ���");
					Except.gugu_Ex(input, ModelDTO.getGugu_dan());
					Menu();
					break;
				case 3:
					input.close();
					System.out.println("���α׷��� ���������� ����!");
					System.exit(0);
				default:
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
					SelectSwitch(input,cal_n1,cal_n2);
		
			}
		}
	
	}
	
	public static void Menu() {
		System.out.println("======<�� ��>======");
		System.out.println("1���� ������ ���� �Դϴ�.");
		System.out.println("2���� ������ �������Դϴ�.");
		System.out.println("3���� ������ ���α׷��� ���� �մϴ�.");
		System.out.println("================");
	}
	
	public static void CalView(Scanner input, int cal_n1, int cal_n2) {

		while (true) {
			try {
				System.out.println("ù ���� ���ڸ� �Է����ּ���:");
				cal_n1 = input.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���:");
				cal_n2 = input.nextInt();

				ModelDTO.cal_Operator(cal_n1, cal_n2);

				System.out.println("�����: " + ModelDTO.getCal_result());
				break;
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
				System.out.println("������ �Է����ּ���.");
				input = new Scanner(System.in);
	
			}

		}
		
	}
	
}
