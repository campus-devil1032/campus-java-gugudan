import java.util.Scanner;

public class MyClassFirst {

	public static void main(String[] args) {
		System.out.println("�������� ������ ���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i >= 1 && i <= 999) {
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "x" + j+"="+i*j);
		}  System.out.println("�Է°��� 1~999�����Դϴ�.");
		
	}
  }
}