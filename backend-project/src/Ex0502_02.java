import java.util.*;

public class Ex0502_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� �Է��ϼ��� : ");
		int i = sc.nextInt();

		if (i <= 0) {
			System.out.println("��ȿ���� ���� �����Դϴ�.(1~999)");
		} else if (i < 1000) {
			for (int j = 1; j < 10; j++)
				System.out.println(i + "x" + j + "=" + i * j);
		} else
			System.out.println("��ȿ���� ���� �����Դϴ�.(1~999)");

		sc.close();
	}

}
