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

	public static void print1To9Dan() { // 1~9���� ����ϴ� �޼ҵ�
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "��");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d", i, j, i * j).println();
			}
			System.out.println();
		}
	}

	public void inputDan() {
		try {
			while (true) {
				System.out.println("���ϴ� ���� �Է��ϼ���.(1~999)");
				int dan = sc.nextInt();
				if (dan > 999 || dan < 1) {
					System.out.println("1~999������ ���ڸ� �Է����ּ���.");
				} else
					model.setDan(dan);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException ����ó��: " + e.getMessage());
			System.out.println("1���� 999������ �ڿ����� �Է��ϼ���");
			sc.next(); // �߸��� �Է��� ����
		}
	}

	public void printUserDan() { // input ���� ���� ����ϴ� �޼ҵ�
		while (true) {
			inputDan(); // ����ڿ��Լ� input�� �޴� �޼ҵ带 ȣ����
			if (model.getDan() > 999 || model.getDan() < 1) {
				System.out.println("1~999������ ���ڸ� �Է����ּ���.");
			} else {
				System.out.println(model.getDan() + "��");
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
