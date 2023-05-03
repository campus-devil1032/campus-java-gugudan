package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan_Ex2 {
	public static void main(String[] args) throws IOException {
		// ������ ���
		// 1��-9�ܱ��� ���
		// Optional : �������� �� ���� �Է� �޴´�. - �� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó��!

		System.out.println("�������� ����, �������� ����! �� ��?");
		System.out.println("q�� �Է��Ͻø� ����˴ϴ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (isInteger(input)) {
			System.out.println("�������� ����, �������� ����! �� ��?");
			System.out.println("q�� �Է��Ͻø� ����˴ϴ�.");
			int i = Integer.parseInt(input);
			if (i < 1000 && 0 < i) {
				int j = 0;
				while (j < 9) {
					j++;
					System.out.println(i + "*" + j + "=" + i * j);

					if (j == 9) {
						System.out.println("������ ��մ�!");
					}
				}
			} else {
				System.out.println("1~999�� ���������� �Է��ϼ���");
				return;
			}
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("�Է��� ���� ���ڿ��Դϴ�");
			return false;
		}

	}
}
