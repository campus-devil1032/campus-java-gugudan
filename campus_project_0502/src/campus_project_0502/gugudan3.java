package campus_project_0502;

import java.util.Scanner;
import java.io.IOException;

public class gugudan3 {
	public void print() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		System.out.println("������ �ܼ��� �Է����ּ��� : ");
		while (true) {
			try {
				dan = sc.nextInt();
				if (dan >= 1 && dan <= 999) {
					for (int i = 1; i < 10; i++) {
						System.out.println(dan + "X" + i + "=" + dan * i);
					}
					break;
				} else {
					System.out.println("�Է¿���!");
				}
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("1~999 ������ ������ �Է����ּ���.");

			}
		}
	}

	public static void main(String[] args) throws IOException {
		gugudan3 in = new gugudan3();
		in.print();
	}
}
