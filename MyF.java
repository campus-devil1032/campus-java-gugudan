import java.util.Scanner;


public class MyF {

	public static void main(String[] args) {
		// �⺻ main �ڵ�
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0; //�˻��Ҷ� �̷����ϴ���
		while (true) {
			System.out.print("����� �� ���� �Է��ϼ��� (1~999): ");
			try {
				dan = scanner.nextInt();
				if (dan <1 || dan > 999) {
					throw new Exception("�Է��� ��ȿ���� �ʽ��ϴ�.");
				}	//try catch ����?
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
		
		for (int i=1; i <=9; i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
		}
	}
}
		// ����
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
		// optinal: �������� �� ���� �Է¹޴´�.
		//			�� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó���Ѵ�.
		// optional: ����Ͻ� ���� �и� �غ�����. View �ܰ� ����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и��غ�����
		