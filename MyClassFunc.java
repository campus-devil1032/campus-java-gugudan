
import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int modType = 0;
		UserInputModel m = new UserInputModel();
		GugudanView v = new GugudanView();

		// ��� ���ú��Դϴ�.
		modType = ModeSelector.selectMod(sc);

		if (modType == 1) {
			m.methodSetInputMinMax(sc);
			min = m.getMin();
			max = m.getMax();
			sc.close();
			v.viewGugudan(min, max);
		}
		// ������ ����Դϴ�.

		if (modType == 2) {
			System.out.println("���ⱸ�����Դϴ�.");
			m.calculation(sc);
		}

	}
	//Ŭ�������� ��弱���� �����մϴ�.
	public static class ModeSelector {
		private static String scc;
		private static int modType;

		public static int selectMod(Scanner sc) {
			System.out.println("����� �������ּ���. 1�� ������, 2�� �����Դϴ�.");

			while (true) {
				scc = sc.next();
				if (isInteger(scc)) {
					modType = Integer.parseInt(scc);
					if (modType == 1) {
						return modType;
					} else if (modType == 2) {
						return modType;
					} else {
						System.out.println("1, 2�߿� �Է����ּ���.");
					}
				} else {
					System.out.println("1, 2�߿� �Է����ּ���.");
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
	
	//������ ǥ���θ� �����մϴ�.
	public static class GugudanView {


		public void viewGugudan(int min, int max) {

			/* ����ϴ� for�� �Դϴ�. */
			for (int i = min; i <= max; i++) {
				System.out.println(i + "��");
				for (int k = 1; k <= 9; k++) {
					System.out.println(i + "X" + k + "=" + i * k);
				}

			}
		}

	}

	

}
