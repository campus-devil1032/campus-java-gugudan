package campus_project_0502;

import java.util.Scanner;

public class gugudan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �ܼ��� �Է��ϼ��� = ");

		int dan = sc.nextInt();

		System.out.println(dan + "��");

		if (dan >= 1) {
			for (int i = 1; i < 10; i++)
				System.out.println(dan + "X" + i + "=" + dan * i);
		} else {
			System.out.println("�Է� �����Դϴ�!");
		}

	}
}

class ExceptionEx

{

	public static void main(String args[])

	{

		try {

			if (dan < 0 || dan > 999) {
				throw new Exception("�Է¹��� '1 ~ 999'�� ������ϴ�.");

		} catch (Exception e) {

			System.out.println("���� �޽��� : " + e.getMessage());

			e.printStackTrace();

		}

		System.out.println("���α׷��� ���� ����Ǿ���.");

	}

}
