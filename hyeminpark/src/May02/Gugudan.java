package May02;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// �������� ����Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
		// Optional: �������� �� ���� �Է¹޴´�.
		//			  �� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó��
		// Optional: ����Ͻ� ���� �и� �غ�����.
		// 			 View �ܰ� ����Ͻ����� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и��غ�����.
		
		int mtp; // �� ��
		int i;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("����� ������ �� ���� �Է��ϼ��� : ");
			mtp = sc.nextInt();
			if (mtp > 999) {
				System.out.println("1~999 ������ ���� ��ȿ�մϴ�.");
			}
			else {
				System.out.println("*****"+mtp+"��*****");
				for (i = 1; i <= 9; i++) {
					System.out.println(mtp+" * "+i+" = "+mtp*i);
				}
				break;
			}
		}	
	}

}
