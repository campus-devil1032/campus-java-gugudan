import java.util.Scanner;

public class practice_230502 {
	public static void main(String[] args) {
		// �������� ����Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
		// Optional: �������� �� ���� �Է¹޴´�.
		// �� ��� 1 ~ 999������ �Է¸� ��ȿ�ϰ� ����ó���� �Ѵ�.
		// Optional : ����Ͻ� ���� �и� �غ�����.
		// View �ܰ� ����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 �и��غ�����.
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "�� ���");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
		System.out.println();
	}
}