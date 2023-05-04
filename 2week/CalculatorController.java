package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorController { // controller
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public String input; // 입력값 처리

	public void inputData() { // 외부에서 접근할 메서드
		boolean isRun = true;
		while (isRun) {
			input = null; // null값을 전역에서 사용해 while들어면 초기화
			menuView(); // 메뉴를 띄운다
			try {
				input = br.readLine(); // 입력받은 메뉴값
				MenuNumber menu = MenuNumber.findByValue(input);
				switch (menu) {
				case QUITE:
					isRun = false;
					break;
				case GUGUDAN:
					calculateGugudan();
					break;
				case CALCULATOR:
					commonCaculate();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			} catch (DanValueOverflowException e) {
				System.out.println("1~999까지만 입력 가능합니다.");
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}catch (IOException e) {
				System.out.println("잘못 입력햇습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private void menuView() { // 메뉴화면 보여주는 메서드
		System.out.println("구구단 & 계산기 프로그램입니다. ");
		System.out.println("=================================================");
		System.out.println("1. 구구단 입력 - 원하는 단수를 입력하면 구구단을 출력");
		System.out.println("2. 계산기 입력 - 원하는 단수를 입력하면 구구단을 출력");
		System.out.println("Q. 종료");
		System.out.println("=================================================");
	}
	
	public enum MenuNumber { // 입력 번호로 메뉴 반환
		QUITE("q"), GUGUDAN("1"), CALCULATOR("2");

		private String number;

		private MenuNumber(String input) {
			this.number = input;
		}

		public static MenuNumber findByValue(String input) {
			for (MenuNumber menuNumber : values()) {	//사용자 입력값으로 메뉴 찾기
				if (menuNumber.getNumber().equals(input)) {
					return menuNumber;
				}
			}
			throw new NumberFormatException();	//위의 값 중 없으면 형식에 맞지 않는 값 -> exception
		}

		public String getNumber() {
			return this.number;
		}
	}
	
	private void calculateGugudan() throws NumberFormatException, DanValueOverflowException, IOException { // 구구단 로직만 처리
		System.out.println("구구단 프로그램입니다. ");
		System.out.print("원하는 단을 입력하세요(1~999) : ");
		input = br.readLine(); // 여기서 에러나도 메인으로
		GugudanModel model = new GugudanModel(input);
		GugudanView view = new GugudanView(model);
		view.viewResult();
	}

	private void commonCaculate() throws NumberFormatException, DanValueOverflowException, IOException { // 계산기 로직만 처리
		System.out.println("계산기 프로그램입니다. ");
		System.out.print("계산식 입력 : "); // 2+3
		input = br.readLine();
		CalculatorModel model = new CalculatorModel(input);
		CalculatorView view = new CalculatorView(model);
		view.viewResult();
	}
}
