import java.util.Scanner;

//Model클래스에서 구구단, 계산기 기능을 지원합니다.
	public class UserInputModel {
		private int max;//구구단의 끝단수
		private int min;//구구단의 시작단수
		

		Scanner sc;

		public void methodSetInputMinMax(Scanner sc) {
			String scannumber;
			this.sc = sc;
			// 사용자로부터 구구단 시작 단수 끝 단수를 입력받습니다. 제한은 1~999입니다.
			// 조건을 만족할경우 break로 for문을 탈출합니다.
			for (; true;) {
				try {

					System.out.println("출력하실 구구단의 시작 단수를 정수로 입력해주세요.(1~999)");
					scannumber = sc.next();
					if (isInteger(scannumber) != true) {
						scannumber = "";
						continue;
					} else {
						this.min = Integer.parseInt(scannumber);
						scannumber = "";
					}
					System.out.println("출력하실 구구단의 끝 단수를 정수로 입력해주세요.(1~999)");
					scannumber = this.sc.next();
					if (isInteger(scannumber) != true) {
						scannumber = "";
						continue;
					} else {
						this.max = Integer.parseInt(scannumber);
						scannumber = "";
					}

				} catch (NumberFormatException e) {
					System.out.println("입력 받은 값이 정수가 아닙니다..");

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
		public double Calculation(Scanner sc) {
			double Num[]= {0,0,0,0,0,0,0,0,0,0};// 계산할 숫자들의 저장배열
			int countNum = 0;// 계산할 숫자들의 수
			char Sign[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};// 계산할 기호들의 저장배열
			int countSign = 0;// 계산할 기호들의 수
			double result = 0.;// 결과값의 배열 로 변경했다가 터져서 일단 배열없이하겠습니다.
			int resultCount = 0;// 계산결과의 총갯수입니다.
			int scclength;// 입력받은식의 전체길이(숫자처리용 for문에 사용)
			char calcChar[]; // 입력받은식을 글자단위로 분할하여 저장할 배열
			String str = ""; // 숫자로 변환하기전 문자의 임시저장소
			String scc;
			
			System.out.println("계산식을 입력해주세요. 예)1+2= / 3*5=");
			scc = sc.next();
			scclength = scc.length();
			calcChar = scc.toCharArray();
			//입력받은것을 숫자, 연산자로 나누어 저장합니다. 이 과정에서 숫자,연산자 이외의 값이 들어오면 터집니다.
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
					//= 연산자를 만나면 저장한 숫자,연산자를 이용하여 게산을합니다. result에 결과를 저장후 반환합니다.
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