
import java.util.*;

public class MyFirstClass {

	public static void gugudan(int n) {
		System.out.println(n + " �� ");
		for(int i = 1; i<=9; i++) {
			System.out.println(n + "*" + i + "=" + (n*i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//�������� ����Ѵ�.
		//1�ܺ��� 9�ܱ��� ����Ѵ�.
		// Optinal :�������� �� ���� �Է¹޴´�.
		//			�� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó���� �Ѵ�.
		// Optional : ����Ͻ� ���� �и� �غ�����. View �ܰ� ����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и��غ�����.
		
		// 2�ܺ��� �����ϰ� 9�ܱ��� �����ϸ� �ݺ����� �ѹ� �������� 1�� ���� ��ŵ�ϴ�.
		
		
		/*for(int i=2; i < 10; i++) {
			System.out.println(i + "���� ��� �մϴ�.");
            
 			for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}*/
		
		
		/*System.out.println("�������� ������ ���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		if(dan >=1 && dan <=999) {

			for (int i = 1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				
			}
		}
		
		*/
		
		for(int i =2; i<=9; i++) {
			gugudan(i);
		}
		
	}

}
