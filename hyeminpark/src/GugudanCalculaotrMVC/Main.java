package GugudanCalculaotrMVC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1. ������ ���");
			System.out.println("2. ��Ģ���� ����");
			System.out.println("3. ����");
			try {
				System.out.println("���ϴ� �۾��� ��ȣ�� �Է��ϼ���: ");
				choice = Integer.parseInt(scanner.nextLine());
				if (choice < 1 || choice > 3) {
					throw new IllegalArgumentException();
				}
			} catch (NumberFormatException e) {
				System.out.println("�߸��� �Է��Դϴ�. ���ڸ� �Է��ϼ���.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("�߸��� �Է��Դϴ�. ����� ���� �߿��� �Է��ϼ���.");
				continue;
			}
			
			if (choice == 1) {
				GugudanModel gmodel = new GugudanModel(2);
		
				GugudanController controllerFirst = new GugudanController(gmodel, null);
				GugudanView viewFirst = new GugudanView(controllerFirst);
				GugudanController controllerSecond = new GugudanController(gmodel,viewFirst);
				GugudanView gview = new GugudanView(controllerSecond);
				gview.run();
				
			} else if (choice == 2) {
				CalculatorModel model = new CalculatorModel();
				CalculatorView view = new CalculatorView();
				CalculatorController controller = new CalculatorController(model, view);
				controller.showTable();
				
			} else if (choice != 3) {
				System.out.println("�߸��� �Է��Դϴ�.");
				
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
	}

}
