
import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int modType = 0;
		Controller c = new Controller();
		Model m = new Model();
		View v = new View();

		// ��� ���ú��Դϴ�.
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
			m.calc(sc);
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
		private double Num[]= {0,0,0,0,0,0,0,0,0,0};// ����� ���ڵ��� ����迭
		private int countNum = 0;// ����� ���ڵ��� ��
		private char Sign[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};// ����� ��ȣ���� ����迭
		private int countSign = 0;// ����� ��ȣ���� ��
		private String scc;
		private int scclength;// �Է¹������� ��ü����(����ó���� for���� ���)
		private char calcChar[]; // �Է¹������� ���ڴ����� �����Ͽ� ������ �迭
		private String str = ""; // ���ڷ� ��ȯ�ϱ��� ������ �ӽ������
		private double result = 0.;// ������� �迭 �� �����ߴٰ� ������ �ϴ� �迭�����ϰڽ��ϴ�.
		private int resultCount = 0;// ������� �Ѱ����Դϴ�.
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

		// ���ⱸ����
		public double calc(Scanner sc) {

			System.out.println("������ �Է����ּ���. ��)1+2= / 3*5=");
			scc = sc.next();
			scclength = scc.length();
			calcChar = scc.toCharArray();
			for (int i = 0; scclength > i; i++) {
				if (calcChar[i] == '+') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '+';
						countSign += 1;
						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}

				} else if (calcChar[i] == '-') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '-';
						countSign += 1;

						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}

				} else if (calcChar[i] == 'X') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '*';
						countSign += 1;

						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}

				} else if (calcChar[i] == '/') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '/';
						countSign += 1;

						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}

				} else if (calcChar[i] == '*') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '*';
						countSign += 1;
						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}

				} else if (calcChar[i] == '%') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '%';
						countSign += 1;

						str = "";
					} else {
						System.out.println("�ùٸ������� �����Դϴ�.");
						countNum = 0;
						countSign = 0;
						result = 0;
						str = "";
						break;
					}
				} else if (calcChar[i] == '=') {
					Num[countNum] = Double.parseDouble(str);
					countNum += 1;
					str = "";
					
					result = Num[0];
					System.out.println(Num[0]);
					System.out.println(Num[1]);
					System.out.println(Num[2]);
					for (int k = 0; countSign > k; k++) {
						System.out.println(Sign[k]);
					}
					for (int j = 0; j < countSign; j++) {
						if (Sign[j] == '+') {
							result += Num[j + 1];
						}
						if (Sign[j] == '-') {
							result -= Num[j + 1];
						}
						if (Sign[j] == '*') {
							result *= Num[j + 1];
						}
						if (Sign[j] == 'X') {
							result *= Num[j + 1];
						}
						if (Sign[j] == '/') {
							result /= Num[j + 1];
						}
						if (Sign[j] == '%') {
							result %= Num[j + 1];
						}
					}
				} else {
					str += calcChar[i];
				}

			}
			System.out.println(str);
			System.out.println(result);
			resultCount += 1;
			return result;

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

	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {

			return false;
		}

	}

}
