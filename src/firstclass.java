import java.util.Scanner;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ����Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
		//optional: ��������  �� ���� �Է¹޴´�.
		//          �̰�� 1~999������ �Է¸� ��ȿ�ϰ� ����ó��
		//optional : ����Ͻ� ���� �и� �غ�����
		//          View �ܰ� ����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и� ���Ѻ�����
		System.out.println("����� �������� �ܼ��� �Է� �ϼ���");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();// ���� c ������ �Է°��� ����
		while(c<=0||c>999) {
			System.out.println("�߸��� ���ڸ� �Է� �ϼ̽��ϴ� �ٽ��Է����ּ���");
			c = sc.nextInt();
		}	// 1~999 �̿ܿ��� ���� �ݷ���
		//��� �κ�//
		System.out.println(c + "���� ��� �ϰڽ��ϴ�");
		System.out.println(c+" x 1 = "+c*1);
		System.out.println(c+" x 2 = "+c*2);
		System.out.println(c+" x 3 = "+c*3);
		System.out.println(c+" x 4 = "+c*4);
		System.out.println(c+" x 5 = "+c*5);
		System.out.println(c+" x 6 = "+c*6);
		System.out.println(c+" x 7 = "+c*7);
		System.out.println(c+" x 8 = "+c*8);
		System.out.println(c+" x 9 = "+c*9);
		}
	}
