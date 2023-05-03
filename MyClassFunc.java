package gugudannew;

import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		int max = 0;
		int min = 0;
		Controller c = new Controller();
		Model m = new Model();
		View v = new View();
		sc = c.methodSetScannerOut();
		// ����ڷκ��� ������ ���� �ܼ� �� �ܼ��� �Է¹޽��ϴ�. ������ 1~999�Դϴ�.
		// ������ �����Ұ�� break�� for���� Ż���մϴ�.

		m.methodSetInputMinMax(sc);
		min = m.getMin();
		max = m.getMax();
		sc.close();
		/* 1�� ~ 9�� ���� ����ϴ� for�� �Դϴ�. */
		// View������ ���а���
		v.viewGugudan(min, max);

		

	}

	public static class Controller {
		private Scanner sca;

		public Controller() {
			this.sca = new Scanner(System.in);
		}

		public Scanner methodSetScannerOut() {
			return this.sca;
		}
	}

	public static class Model {
		private int max;
		private int min;
		private String scannumber;
		Scanner sca;

		public void methodSetInputMinMax(Scanner sca) {
			this.sca = sca;
			for (; true;) {
				try {

					System.out.println("����Ͻ� �������� ���� �ܼ��� ������ �Է����ּ���.(1~999)");
					this.scannumber = sca.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.min = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}
					System.out.println("����Ͻ� �������� �� �ܼ��� ������ �Է����ּ���.(1~999)");
					this.scannumber = this.sca.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.max = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}

				} catch (NumberFormatException e) {
					System.out.println("�Է� ���� ���� ������ �ƴմϴ�..");

				}

				if (min != 0) {
					if (min <= 999) {
						if (max <= 999) {
							if (max >= min) {
								break;
							}
						}
					}
				}
				System.out.println("��Ŀ� �����ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
		}

		public int getMin() {
			return this.min;
		}

		public int getMax() {
			return this.max;
		}

		public boolean isInteger(String s) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}

		}
	}

	public static class View {
		private int min;
		private int max;
		public void viewGugudan(int min, int max) {
			this.min = min;
			this.max = max;
			for (int i = this.min; i <= this.max; i++) {
				System.out.println(i + "��");
				for (int k = 1; k <= 9; k++) {
					System.out.println(i + "X" + k + "=" + i * k);
				}

			}
		}

	}

}
