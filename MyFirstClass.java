
/**
 * 
 * @author hb180
 *
 */

// �ּ��Դϴ�.
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
	/**
	 * 
	 * @param args
	 */
	static void view() {
		Scanner input = new Scanner(System.in);
		int dan = 0;

		//try catch ����
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999)
					System.out.println("1 ~ 999������ �Է¸� ��ȿ");
				
				else if(dan<1)
					System.out.println("1 ~ 999������ �Է¸� ��ȿ");
				else
					break;
				
			}

			catch (Exception e) { //Exception e InputMismatchException
				input = new Scanner(System.in);
				System.out.println("���ܹ߻�! �߸��� �Է�");
				System.out.println("������ �Է��ϼ���");
			}

		}

		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + dan * i);

		input.close();
	}
	
	
	
	
	public static void main(String[] args) {
		
		// �������� ����Ѵ�.
		// 1�ܺ��� 9�ܱ��� ����Ѵ�.
		// Optional: �������� �� ���� �Է¹޴´�.
		//			�� ��� 1 ~ 999������ �Է¸� ��ȿ�ϰ� ����ó���Ѵ�.
		// Optional: �����Ͻ� ���� �и��غ�����. 
		//			 view �ܰ� �����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и��غ�����
		
		System.out.println("������ ��������� �Դϴ�.");
		
		

		view(); //�޼ҵ� ȣ��
	
		//System.out.println("hello world!");
	}

}
