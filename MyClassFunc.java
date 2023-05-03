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
		// 사용자로부터 구구단 시작 단수 끝 단수를 입력받습니다. 제한은 1~999입니다.
		// 조건을 만족할경우 break로 for문을 탈출합니다.

		m.methodSetInputMinMax(sc);
		min = m.getMin();
		max = m.getMax();
		sc.close();
		/* 1단 ~ 9단 까지 출력하는 for문 입니다. */
		// View단으로 구분가능
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

					System.out.println("출력하실 구구단의 시작 단수를 정수로 입력해주세요.(1~999)");
					this.scannumber = sca.next();
					if (isInteger(this.scannumber) != true) {
						this.scannumber = "";
						continue;
					} else {
						this.min = Integer.parseInt(this.scannumber);
						this.scannumber = "";
					}
					System.out.println("출력하실 구구단의 끝 단수를 정수로 입력해주세요.(1~999)");
					this.scannumber = this.sca.next();
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

				if (min > 0) {
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
				System.out.println(i + "단");
				for (int k = 1; k <= 9; k++) {
					System.out.println(i + "X" + k + "=" + i * k);
				}

			}
		}

	}

}
