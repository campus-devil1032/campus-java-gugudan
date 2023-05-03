package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * (1) Integer.parseInt �Լ��� �� �� ȣ���ϰ� ����
 * (2) �̰� �� ���⼭?
 * (3) �ǵ����� ���� ������ ���� ó����
 * (4) �Լ� ���� �ǵ���?
 */
public class GuGuDan_Ex {
	public static void main(String[] args) throws IOException {
		// ������ ���
		// 1��-9�ܱ��� ���
		// Optional : �������� �� ���� �Է� �޴´�. - �� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó��!
		System.out.println("�������� ����, �������� ����! �� ��?");
		System.out.println("q�� �Է��Ͻø� ����˴ϴ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int change = Integer.parseInt(input);
		if (change < 1000 && 0 < change) {
			int i = 0;
			while (i < 9) {
				i++;
				System.out.println(change + "*" + i + "=" + change * i);
			}
			System.out.println("������ ��մ�!");
			return;

		} else if (change <= 0 || 1000 <= change) {
			System.out.println("1~999�� ���������� �Է��ϼ���");
			return;
			
		} else {
			System.out.println("�Է��� ���� ���ڿ��Դϴ�");
			return;
		}
	}

}
