import java.util.Scanner;

//ModelŬ�������� ������, ���� ����� �����մϴ�.
public class UserInputModel {
	private int max;// �������� ���ܼ�
	private int min;// �������� ���۴ܼ�

	private double[] Num = new double[10];// ����� ���ڵ��� ����迭
	private char[] Sign = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };// ����� ��ȣ���� ����迭
	private int countNum = 0;// ����� ���ڵ��� ��
	private int countSign = 0;// ����� ��ȣ���� ��
	private double result = 0.;// ������� �迭 �� �����ߴٰ� ������ �ϴ� �迭�����ϰڽ��ϴ�.
	private String str = ""; // ���ڷ� ��ȯ�ϱ��� ������ �ӽ������
	private int[] priorityPM = new int[10];// ���� �켱������ ó���ϱ����� +,-�� ��ġ�� ����մϴ�.
	private int[] priorityMDM = new int[10];// ���� �켱������ ó���ϱ����� *,/,%�� ��ġ�� ����մϴ�.
	private int priorityPMCount = 0;
	private int priorityMDMCount = 0;
	private int resultCount = 0;// ������� �Ѱ����Դϴ�.

	Scanner sc;

	public void methodSetInputMinMax(Scanner sc) {
		String scannumber;
		this.sc = sc;
		// ����ڷκ��� ������ ���� �ܼ� �� �ܼ��� �Է¹޽��ϴ�. ������ 1~999�Դϴ�.
		// ������ �����Ұ�� break�� for���� Ż���մϴ�.
		for (; true;) {
			try {

				System.out.println("����Ͻ� �������� ���� �ܼ��� ������ �Է����ּ���.(1~999)");
				scannumber = sc.next();
				if (isInteger(scannumber) != true) {
					scannumber = "";
					continue;
				} else {
					this.min = Integer.parseInt(scannumber);
					scannumber = "";
				}
				System.out.println("����Ͻ� �������� �� �ܼ��� ������ �Է����ּ���.(1~999)");
				scannumber = this.sc.next();
				if (isInteger(scannumber) != true) {
					scannumber = "";
					continue;
				} else {
					this.max = Integer.parseInt(scannumber);
					scannumber = "";
				}

			} catch (NumberFormatException e) {
				System.out.println("�Է� ���� ���� ������ �ƴմϴ�..");

			}

			if (this.min != 0) {
				if (this.min <= 999) {
					if (this.max <= 999) {
						if (this.max >= min) {
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

/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////                                                                                ////////////
/////////                                                                                ////////////
/////////                                       ���� �������Դϴ�.                           ////////////
/////////                                                                                ////////////
/////////                                                                                ////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
	// ���� ������Դϴ�. Main�Լ� ���� �����Դϴ�.
	public double calculation(Scanner sc) {

		String scc;

		System.out.println("������ �Է����ּ���. ��)1+2= / 3*5=");
		scc = sc.next();

		// �Է¹������� ����, �����ڷ� ������ �����մϴ�. �� �������� ����,������ �̿��� ���� ������ �����ϴ�.
		setCalcNum(scc);

		result = priorityCalculation(); // ����,�����ȣ�� �������ݴϴ�. ��� �Լ��ȿ��� result�� ó�����ֱ� ������ �ʿ���ºκ������� ���ü��� ���� result =
										// result;�������� �����߽��ϴ�.

		System.out.println(" ");
		System.out.println(result);
		resultCount += 1;
		return result;

	}

	// �Ʒ� ���Լ��� �����ȣ�� +,- // *,/,%�϶� ���� �������ڿ� �����ȣ�� ������ �����ϰ� ����,�����ȣ�� ī��ƮȽ�縦 �÷��ִ�
	// �Լ��Դϴ�.
	private void methodAddOperatorPM(char c, String str) {
		Num[countNum] = Double.parseDouble(str);
		countNum += 1;
		Sign[countSign] = c;
		priorityPM[priorityPMCount] = countSign;
		priorityPMCount += 1;
		countSign += 1;
		this.str = "";
	}

	private void methodAddOperatorMDM(char c, String str) {
		Num[countNum] = Double.parseDouble(str);
		countNum += 1;
		Sign[countSign] = c;
		priorityMDM[priorityMDMCount] = countSign;
		priorityMDMCount += 1;
		countSign += 1;
		this.str = "";
	}

	// ���� ���࿡ ����������� ī���ð����� �ʱ�ȭ�ϴ� �Լ��Դϴ�.
	private void methodCalcInit() {
		this.countNum = 0;
		this.countSign = 0;
		this.result = 0;
		this.str = "";
		this.priorityPMCount = 0;
		this.priorityMDMCount = 0;
	}

	private void setCalcNum(String scc) {
		char calcChar[]; // �Է¹������� ���ڴ����� �����Ͽ� ������ �迭
		int scclength;// �Է¹������� ��ü����(����ó���� for���� ���)
		scclength = scc.length();
		calcChar = scc.toCharArray();

		for (int i = 0; scclength > i; i++) {
			if (calcChar[i] == '+') {
				if (isDouble(str)) {
					methodAddOperatorPM('+', str);
				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}

			} else if (calcChar[i] == '-') {
				if (isDouble(str)) {
					methodAddOperatorPM('-', str);
				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}

			} else if (calcChar[i] == 'X') {
				if (isDouble(str)) {
					methodAddOperatorMDM('*', str);

				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}

			} else if (calcChar[i] == '/') {
				if (isDouble(str)) {
					methodAddOperatorMDM('/', str);

				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}

			} else if (calcChar[i] == '*') {
				if (isDouble(str)) {
					methodAddOperatorMDM('*', str);

				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}

			} else if (calcChar[i] == '%') {
				if (isDouble(str)) {
					methodAddOperatorMDM('%', str);

				} else {
					System.out.println("�ùٸ������� �����Դϴ�.");
					methodCalcInit();
					break;
				}
				// = �����ڸ� ������ ������ ����,�����ڸ� �̿��Ͽ� �Ի����մϴ�. result�� ����� ������ ��ȯ�մϴ�.
			} else if (calcChar[i] == '=') {
				// ���������ڵڿ��� =�̿��� �����ڰ� �����ʱ� ������ ���������� for�� ������ ó���մϴ�.
				Num[countNum] = Double.parseDouble(str);
				countNum += 1;
				str = "";
				/////////////////////////////////////////////////////////////////////

				priorityPM[priorityPMCount] = countSign;// �켱���� ������ ���� �߰��� �����Դϴ�.
				priorityPMCount += 1;
				////////////////////////////////////////////////////////////////////
				break;
				// ���� ������ ������ �켱����

			} else {
				str += calcChar[i];
			}

		} // for�� ��
	}

	// �Է¹������� ����,�����ڷ� ������ ���� ������ ���Դϴ�.
	private double priorityCalculation() {
		// + - ������ ������ ���� for���� ����.
		if (priorityPMCount != 1) {
			for (int j = 0; j < priorityPMCount; j++) {
				for (int k = priorityPM[j]; k < priorityPM[j + 1]; k++) {
					if (Sign[priorityMDM[k]] == '*') {
						Num[priorityPM[j] + 1] *= Num[priorityMDM[k] + 1];
					}
					if (Sign[priorityMDM[k]] == 'X') {
						Num[priorityPM[j] + 1] *= Num[priorityMDM[k] + 1];
					}
					if (Sign[priorityMDM[k]] == '/') {
						Num[priorityPM[j] + 1] /= Num[priorityMDM[k] + 1];
					}
					if (Sign[priorityMDM[k]] == '%') {
						Num[priorityPM[j] + 1] %= Num[priorityMDM[k] + 1];
					}
				}
			}
			/*
			 * for (int j = 0; j < priorityMDMCount; j++) { if (Sign[priorityMDM[j]] == '*')
			 * { Num[priorityMDM[j]] *= Num[priorityMDM[j] + 1]; } if (Sign[priorityMDM[j]]
			 * == 'X') { Num[priorityMDM[j]] *= Num[priorityMDM[j] + 1]; } if
			 * (Sign[priorityMDM[j]] == '/') { Num[priorityMDM[j]] /= Num[priorityMDM[j] +
			 * 1]; } if (Sign[priorityMDM[j]] == '%') { Num[priorityMDM[j]] %=
			 * Num[priorityMDM[j] + 1]; } }
			 */
			result = Num[0];
			for (int j = 0; j < priorityPMCount - 1; j++) {

				if (Sign[priorityPM[j]] == '+') {
					result += Num[priorityPM[j] + 1];
				}
				if (Sign[priorityPM[j]] == '-') {
					result -= Num[priorityPM[j] + 1];
				}
			}
		} else {
			result = Num[0];
			for (int j = 0; j < priorityMDMCount; j++) {
				if (Sign[priorityMDM[j]] == '*') {
					result *= Num[priorityMDM[j] + 1];
				}
				if (Sign[priorityMDM[j]] == 'X') {
					result *= Num[priorityMDM[j] + 1];
				}
				if (Sign[priorityMDM[j]] == '/') {
					result /= Num[priorityMDM[j] + 1];
				}
				if (Sign[priorityMDM[j]] == '%') {
					result %= Num[priorityMDM[j] + 1];
				}
			}
		}
		

		return result;
	}

	private static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	private static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {

			return false;
		}

	}

}