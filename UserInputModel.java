import java.util.Scanner;

//ModelŬ�������� ������, ���� ����� �����մϴ�.
	public class UserInputModel {
		private int max;//�������� ���ܼ�
		private int min;//�������� ���۴ܼ�
		

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

		// ���ⱸ����
		public double Calculation(Scanner sc) {
			double Num[]= {0,0,0,0,0,0,0,0,0,0};// ����� ���ڵ��� ����迭
			int countNum = 0;// ����� ���ڵ��� ��
			char Sign[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};// ����� ��ȣ���� ����迭
			int countSign = 0;// ����� ��ȣ���� ��
			double result = 0.;// ������� �迭 �� �����ߴٰ� ������ �ϴ� �迭�����ϰڽ��ϴ�.
			int resultCount = 0;// ������� �Ѱ����Դϴ�.
			int scclength;// �Է¹������� ��ü����(����ó���� for���� ���)
			char calcChar[]; // �Է¹������� ���ڴ����� �����Ͽ� ������ �迭
			String str = ""; // ���ڷ� ��ȯ�ϱ��� ������ �ӽ������
			String scc;
			
			System.out.println("������ �Է����ּ���. ��)1+2= / 3*5=");
			scc = sc.next();
			scclength = scc.length();
			calcChar = scc.toCharArray();
			//�Է¹������� ����, �����ڷ� ������ �����մϴ�. �� �������� ����,������ �̿��� ���� ������ �����ϴ�.
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
					//= �����ڸ� ������ ������ ����,�����ڸ� �̿��Ͽ� �Ի����մϴ�. result�� ����� ������ ��ȯ�մϴ�.
				} else if (calcChar[i] == '=') {
					Num[countNum] = Double.parseDouble(str);
					countNum += 1;
					str = "";
					
					result = Num[0];
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