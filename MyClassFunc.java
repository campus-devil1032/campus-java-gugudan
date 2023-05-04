
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

		// 모드 선택부입니다.
		modType = c.selectMod(sc);

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
			m.calc(sc);
		}

	}

	public static class Controller {
		private String scc;
		private int modType;

		public int selectMod(Scanner sc) {
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
	}

	public static class Model {
		private int max;
		private int min;
		private double Num[]= {0,0,0,0,0,0,0,0,0,0};// 계산할 숫자들의 저장배열
		private int countNum = 0;// 계산할 숫자들의 수
		private char Sign[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};// 계산할 기호들의 저장배열
		private int countSign = 0;// 계산할 기호들의 수
		private String scc;
		private int scclength;// 입력받은식의 전체길이(숫자처리용 for문에 사용)
		private char calcChar[]; // 입력받은식을 글자단위로 분할하여 저장할 배열
		private String str = ""; // 숫자로 변환하기전 문자의 임시저장소
		private double result = 0.;// 결과값의 배열 로 변경했다가 터져서 일단 배열없이하겠습니다.
		private int resultCount = 0;// 계산결과의 총갯수입니다.
		private String scannumber;
		Scanner sc;

		public void methodSetInputMinMax(Scanner sc) {
			this.sc = sc;
			// 사용자로부터 구구단 시작 단수 끝 단수를 입력받습니다. 제한은 1~999입니다.
			// 조건을 만족할경우 break로 for문을 탈출합니다.
			for (; true;) {
				try {

					System.out.println("출력하실 구구단의 시작 단수를 정수로 입력해주세요.(1~999)");
					this.scannumber = sc.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.min = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}
					System.out.println("출력하실 구구단의 끝 단수를 정수로 입력해주세요.(1~999)");
					this.scannumber = this.sc.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.max = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}

				} catch (NumberFormatException e) {
					System.out.println("입력 받은 값이 정수가 아닙니다..");

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
				System.out.println("양식에 맞지않습니다. 다시 입력해주세요.");
			}
		}

		public int getMin() {
			return this.min;
		}

		public int getMax() {
			return this.max;
		}

		// 계산기구현부
		public double calc(Scanner sc) {

			System.out.println("계산식을 입력해주세요. 예)1+2= / 3*5=");
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
						System.out.println("올바르지않은 계산식입니다.");
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
						System.out.println("올바르지않은 계산식입니다.");
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
						System.out.println("올바르지않은 계산식입니다.");
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
						System.out.println("올바르지않은 계산식입니다.");
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
						System.out.println("올바르지않은 계산식입니다.");
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
						System.out.println("올바르지않은 계산식입니다.");
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
			/* 출력하는 for문 입니다. */
			for (int i = this.min; i <= this.max; i++) {
				System.out.println(i + "단");
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
