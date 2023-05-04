
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
		// 구구단 모드입니다.

		if (modType == 2) {
			System.out.println("계산기구현중입니다.");
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
		private double x;
		private double y;
		private String scc;

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
		//계산기구현부
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

}
