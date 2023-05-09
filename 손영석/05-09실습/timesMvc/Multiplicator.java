package timesMvc;

// 구구단 클래스
public class Multiplicator {
	static TimesTableController controller = new TimesTableController();
	static TimesTableModel model = new TimesTableModel();

	static void mul() {
		String num; // 입력값(문자열)
		int iNum; // 입력값(int 변환)

		while (true) {
			try {
				// 숫자 입력받기
				System.out.println("<1~999 사이의 정수를 입력하세요>");
				System.out.println("(메뉴 화면: X 또는 0 입력)");
				num = controller.getInput();

				// 구구단 계산하기
				if (num.equals("x") || num.equals("X") || Integer.parseInt(num) == 0) { // X 또는 0 입력 시 종료
					System.out.println("메뉴 화면으로 돌아갑니다.");
					break;

				} else {
					iNum = Integer.parseInt(num);

					if (iNum < 1 || iNum > 999) { // 입력범위제한
						System.err.println("1에서 999 사이의 정수가 아닙니다.");
						return;

					} else {
						System.out.println(num + "단을 출력합니다.");
						System.out.println("====================");
						model.runMultiplicator(iNum);
						System.out.println("====================");
					}
				}

			} catch (NumberFormatException e) { // 자료형 불일치 시
				System.err.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
		}
	}
}
