import java.util.InputMismatchException;
import java.util.Scanner;

class GugudanModel {
	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
}

class GugudanView {
	private Scanner sc;
	private GugudanModel model;

	public GugudanView() {
		sc = new Scanner(System.in);
		model = new GugudanModel();
	}

	public static void print1To9Dan() { // 1~9단을 출력하는 메소드
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d", i, j, i * j).println();
			}
			System.out.println();
		}
	}

	public void inputDan() {
		try {
			while (true) {
				System.out.println("원하는 단을 입력하세요.(1~999)");
				int dan = sc.nextInt();
				if (dan > 999 || dan < 1) {
					System.out.println("1~999사이의 숫자를 입력해주세요.");
				} else
					model.setDan(dan);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 예외처리: " + e.getMessage());
			System.out.println("1에서 999사이의 자연수를 입력하세요");
			sc.next(); // 잘못된 입력을 버림
		}
	}

	public void printUserDan() { // input 받은 단을 출력하는 메소드
		while (true) {
			inputDan(); // 사용자에게서 input을 받는 메소드를 호출함
			if (model.getDan() > 999 || model.getDan() < 1) {
				System.out.println("1~999사이의 숫자를 입력해주세요.");
			} else {
				System.out.println(model.getDan() + "단");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d", model.getDan(), i, model.getDan() * i).println();
				}
				break;
			}
		}
	}
}

public class GugudanController {

	public static void main(String[] args) throws InputMismatchException {
		GugudanView view = new GugudanView();
		GugudanView.print1To9Dan();
		view.printUserDan();
	}
}
