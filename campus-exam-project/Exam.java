import java.util.Scanner;
//�������� ����Ѵ�.
//1�ܺ��� 9�ܱ��� ����Ѵ�.
//Optional: �������� �� ���� �Է¹޴´�.
//			�� ��� 1~999������ �Է¸� ��ȿ�ϰ� ����ó���� �Ѵ�.
//Optional: ����Ͻ� ���� �и� �غ�����.
//			view �ܰ� �����Ͻ� ���� Ŭ������ ���� �����ؼ� �ڵ带 ���ο��� �и��غ���
public class Exam {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
		      for (int j = 1; j <= 9; j++) {
		        System.out.print(i+"*"+j+"="+String.format("%2d", i * j));
		        System.out.print(" ");
		      }
		      System.out.println();

		}
	}
}
