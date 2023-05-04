
import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int modType;
		Controller c = new Controller();
		Model m = new Model();
		View v = new View();
		modType = c.selectMod(sc);

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
		}

	}

	public static class Controller {
		private String scc;
		private int modType;

		public int selectMod(Scanner sc) {
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
	}

	public static class Model {
		private int max;
		private int min;
		private double x;
		private double y;
		private String scc;

		private String scannumber;
		Scanner sc;

		public void methodSetInputMinMax(Scanner sc) {
			this.sc = sc;
			// ����ڷκ��� ������ ���� �ܼ� �� �ܼ��� �Է¹޽��ϴ�. ������ 1~999�Դϴ�.
			// ������ �����Ұ�� break�� for���� Ż���մϴ�.
			for (; true;) {
				try {

					System.out.println("����Ͻ� �������� ���� �ܼ��� ������ �Է����ּ���.(1~999)");
					this.scannumber = sc.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.min = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}
					System.out.println("����Ͻ� �������� �� �ܼ��� ������ �Է����ּ���.(1~999)");
					this.scannumber = this.sc.next();
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

		public double calcSum(double x, double y) {
			return x + y;
		}

		public double calcMinus(double x, double y) {
			return x - y;
		}

		public double calcMultiply(double x, double y) {
			return x * y;
		}

		public double calcDivide(double x, double y) {
			return x / y;
		}

		public double calcModulo(double x, double y) {
			return x % y;
		}
		//���ⱸ����
		public double calc(Scanner sc) {
			scc=sc.next();
			
			return 0.;
			
		}

	}

	public static class View {
		private int min;
		private int max;

		public void viewGugudan(int min, int max) {
			this.min = min;
			this.max = max;
			/* ����ϴ� for�� �Դϴ�. */
			for (int i = this.min; i <= this.max; i++) {
				System.out.println(i + "��");
				for (int k = 1; k <= 9; k++) {
					System.out.println(i + "X" + k + "=" + i * k);
				}

			}
		}

	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
