
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {

		System.out.println("1 ~ 999 ������ �ܼ��� �Է��ϼ��� : "); // �Է��϶�� ����
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // �Է¹ޱ�
		String num = input.readLine(); // ���ڿ��� �Է°� �ޱ�
		int inputNum = Integer.parseInt(num); // �޾� �� ���ڿ��� ������ ��ȯ�� ���� ������ �ޱ�

		if (inputNum > 999) {
			System.out.println("999 ������ ���ڸ� �Է��ϼ���.");
		} 
		
		else if (inputNum < 1) {
			System.out.println("1 ������ ���ڸ� �Է��ϼ���.");
		}
		
		else {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "X" + i + "=" + inputNum * i);
			}
		}

	}
}