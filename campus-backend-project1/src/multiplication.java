import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		
		view();
		// �������� ��� �Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.

		
}
static void view() {
	
	boolean retry = true;//���α׷� �ٽ� ������ ���� ��
		while (retry) {
			int i;
			Scanner number = new Scanner(System.in);
			System.out.println("���ϴ� �������� ���� �Է��Ͻʽÿ�. ");
			i = number.nextInt();
			if (0 < i && i < 999)//0���� 999���� ���ڸ� �Է�
			{
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + j * i); //������ ���
				}

			} else {
				System.out.println("�Է��Ͻ� ���ڰ� �ʹ� ũ�ų� �����Դϴ�.");
			}
			
			System.out.println("�ٽ� �����Ͻðڽ���? (y/n)");
			String check = number.next();
			if (check.equals("n"))//�Է� ���ڰ� n�̸� retry������
			{
				retry = false;
			}
		}
		System.out.println("������ ���α׷� ����");
		System.exit(0);
	}
}https://github.com/campus-devil1032/campus-java-gugudan.git