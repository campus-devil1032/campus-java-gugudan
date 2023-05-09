package GugudanCalculaotrMVC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1. 구구단 출력");
			System.out.println("2. 사칙연산 계산기");
			System.out.println("3. 종료");
			try {
				System.out.println("원하는 작업의 번호를 입력하세요: ");
				choice = Integer.parseInt(scanner.nextLine());
				if (choice < 1 || choice > 3) {
					throw new IllegalArgumentException();
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("잘못된 입력입니다. 목록의 숫자 중에서 입력하세요.");
				continue;
			}
			
			if (choice == 1) {
				// 구구단 출력
				GugudanModel model = new GugudanModel(2);
				GugudanController controllerFirst = new GugudanController(model, null);
				GugudanView viewFirst = new GugudanView(controllerFirst);
				GugudanController controllerSecond = new GugudanController(model,viewFirst);
				GugudanView view = new GugudanView(controllerSecond);
				view.run();
			
			} else if (choice == 2) {
				// 계산기 출력
				CalculatorModel model = new CalculatorModel();
				CalculatorView view = new CalculatorView();
				CalculatorController controller = new CalculatorController(model, view);
				controller.showTable();
				
			} else if (choice != 3) {
				System.out.println("잘못된 입력입니다.");
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}

}
