import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;

		// ����ڷκ��� ������ ���� �ܼ� �� �ܼ��� �Է¹޽��ϴ�. ������ 1~999�Դϴ�.
		// ������ �����Ұ�� break�� for���� Ż���մϴ�.
		// �����ܿ� �Է��� �޾������ ����ó���� ��� �ؾ����� �𸣰ڽ��ϴ�. ���۸��� �غ��ڽ��ϴ�.
		for (; true;) {
			try {

				System.out.println("����Ͻ� �������� ���� �ܼ��� ������ �Է����ּ���.(1~999)");
				min = sc.nextInt();
				System.out.println("����Ͻ� �������� �� �ܼ��� ������ �Է����ּ���.(1~999)");
				max = sc.nextInt();

			} catch (Exception e) {
				System.out.println("�Է� ���� ���� ������ �ƴմϴ�..");
				
				throw e;
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
			System.out.println("��Ŀ� �����ʽ��ϴ�. �ٽ� �Է����ּ���.");
		}

		/* 1�� ~ 9�� ���� ����ϴ� for�� �Դϴ�. */
		for (int i = min; i <= max; i++) {
			System.out.println(i + "��");
			for (int k = 1; k <= 9; k++) {
				System.out.println(i + "X" + k + "=" + i * k);
			}

		}

	}

}
