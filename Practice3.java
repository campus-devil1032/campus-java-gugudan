
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) {

		System.out.println("1 ~ 999 ������ �ܼ��� �Է��ϼ��� : "); // �Է��϶�� ����
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // �Է¹ޱ�
		try {
			String num = input.readLine();
			
			int inputNum = Integer.parseInt(num); // �޾� �� ���ڿ��� ������ ��ȯ�� ���� ������ �ޱ�

			if (inputNum > 999 || inputNum < 1) {
				System.out.println("1 ~ 999 ������ ���ڸ� �Է��ϼ���.");
			}

			else {
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "X" + i + "=" + inputNum * i);
				}

			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // ���ڿ��� �Է°� �ޱ�

	}
}