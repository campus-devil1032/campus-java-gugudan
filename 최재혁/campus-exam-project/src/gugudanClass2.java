import java.util.Scanner;

class GugudanError extends Exception {
	GugudanError() {

	}

	GugudanError(String message) {
		super(message);
	}
}

public class GugudanClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ���ڸ� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); // �Է¹��� ���� i�� ����
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
			sc.close();
			while (true) {
				try {
					System.out.print("1���� 999 ������ ������ �Է��ϼ��� : ");
					if (i < 1 || i > 999) {
						throw new GugudanError(); // ���� �߻�
					} else {
						break;
					}
				} catch (GugudanError e) {
					System.out.println("�Է¿��� : 1 ~ 999 ������ ������ �Է����ּ���");
					sc.nextLine(); // �Է°� ����
				}
			}
		}
	}
}
