package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.naming.NameAlreadyBoundException;

public class CalculatorController { // controller
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input;

	public void inputData() { // 외부에서 접근할 메서드
		while (true) {
			input = null; // null값을 전역에서 사용해 while들어면 초기화
			menuView(); // 메뉴를 띄운다
			try {
				input = br.readLine(); // 입력받은 메뉴값
				if (input.toLowerCase().equals("q")) {
					break;
				} else if (input.equals("1")) { // 구구단
					calculateGugudan();
				} else if (input.equals("2")) { // 계산기
					commonCaculate();
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			} catch (DanValueOverflowException e) {
				System.out.println("1~999까지만 입력 가능합니다.");
			} catch (IOException e) {
				System.out.println("잘못 입력햇습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private void menuView() { // 메뉴화면 보여주는 메서드
		System.out.println("구구단 & 계산기 프로그램입니다. ");
		System.out.println("================================");
		System.out.println("1. 구구단 입력 - 원하는 단수를 입력하면 구구단을 출력");
		System.out.println("2. : 계산기 입력 - 원하는 단수를 입력하면 구구단을 출력");
		System.out.println("Q : 종료");
		System.out.println("================================");
	}

	private void calculateGugudan() throws NumberFormatException,DanValueOverflowException,IOException{ // 구구단 로직만 처리
		input=null;
		System.out.println(" 구구단 프로그램입니다. ");
		System.out.print(" 원하는 단을 입력하세요(1~999) : ");
		input = br.readLine();	//여기서 에러나도 메인으로
		GugudanModel model = new GugudanModel(input);
		model.isValidDan();		//입력한 '단' 검증, 여기서 에러나도 메인으로
		GugudanView view = new GugudanView(model);
		view.viewResult();
	}

	private void commonCaculate() throws NumberFormatException,DanValueOverflowException,IOException{ // 계산기 로직만 처리
		input=null;
		System.out.println(" 계산기 프로그램입니다. ");
		System.out.print(" 계산을 할 값 2개를 입력하세요 : ");
		input = br.readLine();
		CalculatorModel model = new CalculatorModel(input);
		System.out.println("1.더하기	2.빼기	3.곱하기		4.나누기");
		input = br.readLine();
		switch (input) {
		case "1":
			model.addValue();
			break;
		case "2":
			model.minusValue();
			break;
		case "3":
			model.timesValue();
			break;
		case "4":
			model.divideValue();
			break;
		default:
			throw new NumberFormatException();
		}
		CalculatorView view = new CalculatorView(model);
		view.viewResult();
	}
}
