package NewGuGuDanExample;


public class NewGuGuDanExampleModel {

	public static void inputUserMessege() {
		System.out.println("===========================");
		System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
		System.out.println("q를 입력하시면 종료됩니다.");
		System.out.println("===========================");
	}

	public static void setInput(String value) {
		while (true) {
			
			if (isInteger(value)==false) {
			NewGuGuDanExampleControllor.run();
			}
			
			if (isInteger(value)) {
				int i = Integer.parseInt(value);
				if (i < 1000 && 0 < i) {
					int j = 0;
					while (j < 9) {
						j++;
						System.out.println(i + "*" + j + "=" + i * j);

						if (j == 9) {
							System.out.println("구구단 재밌다!" + "\n");

						}
					}
					NewGuGuDanExampleControllor.run();
				}

			}  if (isInteger(value) == false) {
				NewGuGuDanExampleControllor.run();

			} else {
				System.out.println("1~999의 범위에서만 입력하세요");
				NewGuGuDanExampleControllor.run();
			}

		}
	}

	public static void getInput() {
		NewGuGuDanExampleModel.setInput(null);
	}

	public static void exitMessege() {
		System.out.println("안녕!");
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
		}
		System.out.println("입력한 값은 문자열입니다");
		return false;
	}

}