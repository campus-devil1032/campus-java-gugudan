package campus_project_0502;

import java.util.Scanner;

public class gugudan2 {
	public static void main(String[] args) {
		// �Է� �ޱ� ���� ��ĳ�� ��ü ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ܼ��� �Է��ϼ��� = ");
		// ���� �Է¹ޱ�
		int dan = sc.nextInt();
		
		System.out.println(dan + "��");
		
		if (dan >= 1) {
			for ( int i = 1; i < 10; i++ )
				System.out.println( dan + "X" + i + "=" + dan*i );
		} else { 
			System.out.println("�Է� �����Դϴ�.!");
		}
	}
}
