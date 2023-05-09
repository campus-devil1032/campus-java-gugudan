import java.util.Scanner;

//Model클래스에서 구구단, 계산기 기능을 지원합니다.
	public class UserInputModel {
		private int max;//구구단의 끝단수
		private int min;//구구단의 시작단수
		
		
		
		private double[] Num= new double[10];// 계산할 숫자들의 저장배열
		private char[] Sign= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};// 계산할 기호들의 저장배열
		private int countNum = 0;// 계산할 숫자들의 수
		private int countSign = 0;// 계산할 기호들의 수
		private double result = 0.;// 결과값의 배열 로 변경했다가 터져서 일단 배열없이하겠습니다.
		private String str = ""; // 숫자로 변환하기전 문자의 임시저장소
		private int[] priorityPM = new int[10];//연산 우선순위를 처리하기위해 +,-의 위치를 기억합니다.
		private int[] priorityMDM = new int[10];//연산 우선순위를 처리하기위해 *,/,%의 위치를 기억합니다.
		private int priorityPMCount = 0;
		private int priorityMDMCount = 0;
		private int resultCount = 0;// 계산결과의 총갯수입니다.

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
			
			
			
			int scclength;// 입력받은식의 전체길이(숫자처리용 for문에 사용)
			char calcChar[]; // 입력받은식을 글자단위로 분할하여 저장할 배열
			
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
						priorityPM[priorityPMCount] = countSign;
						priorityPMCount += 1;
						countSign += 1;
						str = "";
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}

				} else if (calcChar[i] == '-') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '-';
						priorityPM[priorityPMCount] = countSign;
						priorityPMCount += 1;
						countSign += 1;

						str = "";
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}

				} else if (calcChar[i] == 'X') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '*';
						priorityMDM[priorityMDMCount] = countSign;
						priorityMDMCount += 1;
						countSign += 1;

						str = "";
						
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}

				} else if (calcChar[i] == '/') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '/';
						priorityMDM[priorityMDMCount] = countSign;
						priorityMDMCount += 1;
						countSign += 1;

						str = "";
						
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}

				} else if (calcChar[i] == '*') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '*';
						priorityMDM[priorityMDMCount] = countSign;
						priorityMDMCount += 1;
						countSign += 1;
						str = "";
						
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}

				} else if (calcChar[i] == '%') {
					if (isDouble(str)) {
						Num[countNum] = Double.parseDouble(str);
						countNum += 1;
						Sign[countSign] = '%';
						priorityMDM[priorityMDMCount] = countSign;
						priorityMDMCount += 1;
						countSign += 1;

						str = "";
						
					} else {
						System.out.println("올바르지않은 계산식입니다.");
						methodCalcInit();
						break;
					}
					//= 연산자를 만나면 저장한 숫자,연산자를 이용하여 게산을합니다. result에 결과를 저장후 반환합니다.
				} else if (calcChar[i] == '=') {
					Num[countNum] = Double.parseDouble(str);
					countNum += 1;
					str = "";
					
					/*result = Num[0];*/
					/*need fix bottom line code +-X/   need priority() */
					/** 사용하여 바꿀예정 근데 갈아엎어야해서 엄두가안남
					 * priorityMDM[priorityMDMCount] = countSign;
					 *	priorityMDMCount += 1;
					 * ()사용한 우선순위도 추가해야함 나중에 다시 갈아엎어야함
					 * substring을 사용하자.
					 * 초기화부를 따로 구현해서 함수를 늘리고 코드길이 압축좀할까?
					 */
					//곱셈 나눗셈 나머지 우선연산
					for(int j = 0; j<priorityMDMCount;j++) {
						if (Sign[priorityMDM[j]] == '*') {
							Num[priorityMDM[j]] *= Num[priorityMDM[j] + 1];
						}
						if (Sign[priorityMDM[j]] == 'X') {
							Num[priorityMDM[j]] *= Num[priorityMDM[j] + 1];
						}
						if (Sign[priorityMDM[j]] == '/') {
							Num[priorityMDM[j]] /= Num[priorityMDM[j] + 1];
						}
						if (Sign[priorityMDM[j]] == '%') {
							Num[priorityMDM[j]] %= Num[priorityMDM[j] + 1];
						}
					} 
					result = Num[0];
					for(int j = 0; j<priorityPMCount;j++) {
						
						if (Sign[priorityPM[j]] == '+') {
							result += Num[priorityPM[j] + 1];
						}
						if (Sign[priorityPM[j]] == '-') {
							result -= Num[priorityPM[j] + 1];
						}
					}
					/*
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
					}*/
				} else {
					str += calcChar[i];
				}

			}
			System.out.println(str);
			System.out.println(result);
			resultCount += 1;
			return result;

		}
		/*
		private void methodAddOperatorPM(char c, String str) {
			Num[countNum] = Double.parseDouble(str);
			countNum += 1;
			Sign[countSign] = c;
			priorityPM[priorityPMCount] = countSign;
			priorityPMCount += 1;
			countSign += 1;
			str = "";
		}*/
		private void methodAddOperatorMDM(char c, String str) {
			Num[countNum] = Double.parseDouble(str);
			countNum += 1;
			Sign[countSign] = c;
			priorityMDM[priorityMDMCount] = countSign;
			priorityMDMCount += 1;
			countSign += 1;
			str = "";
		}
		
		//계산기 싱행에 실패했을경우 카운팅값들을 초기화하는 함수입니다.
		private void methodCalcInit(){
			countNum = 0;
			countSign = 0;
			result = 0;
			str = "";
			priorityPMCount = 0;
			priorityMDMCount = 0;
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