package test1;
import java.util.Scanner;

public class myfirst {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		//��ĳ�� ��ü ����
		//��ĳ�� �̸� �ܿ� �� ������ ��ü�� ������.(����ȭ �Ǿ��ִ�)
		//Scanner '�̸�' = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ��� : ");
		int c = value.nextInt();
		//������ ���� �Է¹��� ���̱� ������ int�� �� �Է¸޼���
		if(c >= 1 && c <= 999) {
		//��ȿ���� 1~999�� �������ֱ� ���� if��
			for(int i = 1; i < 10; i ++) {
			//������ for��	
				System.out.print(""+c+" x "+i+" = ");
				System.out.println(c*i);
			}
		}
		else {
			System.out.println("error : ��ȿ���� ���� �����Դϴ�.");
		}
		//����ó��??
	}

}
