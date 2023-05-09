
import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int modType = 0;
		UserInputModel m = new UserInputModel();
		GugudanView v = new GugudanView();

		// 모드 선택부입니다.
		modType = ModeSelector.selectMod(sc);

		if (modType == 1) {
			m.methodSetInputMinMax(sc);
			min = m.getMin();
			max = m.getMax();
			sc.close();
			v.viewGugudan(min, max);
		}
		// 구구단 모드입니다.

		if (modType == 2) {
			System.out.println("계산기구현중입니다.");
			m.calculation(sc);
		}

	}
	//클래스에서 모드선택을 지원합니다.
	public static class ModeSelector {
		private static String scc;
		private static int modType;

		public static int selectMod(Scanner sc) {
			System.out.println("기능을 선택해주세요. 1은 구구단, 2는 계산기입니다.");

			while (true) {
				scc = sc.next();
				if (isInteger(scc)) {
					modType = Integer.parseInt(scc);
					if (modType == 1) {
						return modType;
					} else if (modType == 2) {
						return modType;
					} else {
						System.out.println("1, 2중에 입력해주세요.");
					}
				} else {
					System.out.println("1, 2중에 입력해주세요.");
				}
			}
		}
		private static boolean isInteger(String s) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}

		}
	}
	
	//구구단 표현부를 지원합니다.
	public static class GugudanView {


		public void viewGugudan(int min, int max) {

			/* 출력하는 for문 입니다. */
			for (int i = min; i <= max; i++) {
				System.out.println(i + "단");
				for (int k = 1; k <= 9; k++) {
					System.out.println(i + "X" + k + "=" + i * k);
				}

			}
		}

	}

	

}
