import java.util.Scanner;

public class gugudanClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ���ڸ� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); //�Է¹��� ���� i�� ����
		for (int j=1 ; j<10; j++) {
			System.out.println(i+"*"+j +"="+ i*j);
			sc.close();
		}
	}

}
