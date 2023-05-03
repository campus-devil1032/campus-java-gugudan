
package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan_Ex3 {
	public static void main(String[] args) throws IOException {
		// ������ ���
		// 1��-9�ܱ��� ���
		// Optional : �������� �� ���� �Է� �޴´�. - �� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó��!

		while (true) {
			// 0. ȭ�� ����
			for (int i = 0; i < 2; i++) {
				System.out.println("");
			}
			System.out.println("========================================================");

			// 1. ���� ����
			System.out.println("�������� ����, �������� ����! �� ��?");
			System.out.println("q�� �Է��Ͻø� ����˴ϴ�.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			// 2. ���� üũ

			if (input.equals("q")) {
				System.out.println("�ȳ�!");
				break;
			}

			if (isInteger(input)) {
				int i = Integer.parseInt(input);
				if (i < 1000 && 0 < i) {
					// 3. ������ ���
					int j = 0;
					while (j < 9) {
						j++;
						System.out.println(i + "*" + j + "=" + i * j);

						if (j == 9) {
							System.out.println("������ ��մ�!");
						}
					}
				} else {
				}
				System.out.println("1~999�� ���������� �Է��ϼ���");
			}
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
		}
		System.out.println("�Է��� ���� ���ڿ��Դϴ�");
		return false;
	}
}