package GugudanMVC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanModel {
	
	public static void gugudanInput() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // �Է¹ޱ�
		
		try {
			String num = input.readLine(); // ���ڿ��� �Է°� �ޱ�
			
			int inputNum = Integer.parseInt(num); // �޾� �� ���ڿ��� ������ ��ȯ�� ���� ������ �ޱ�

			if (inputNum > 999 || inputNum < 1) {
				System.out.println("1 ~ 999 ������ ���ڸ� �Է��ϼ���.");
			}

			else {
				
				System.out.println(inputNum + "�� ����");
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "X" + i + "=" + inputNum * i);
				}

			}
			
		}
		
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		catch (NullPointerException e) { //null ��ü�� ������ ��
			System.out.println(e.getMessage());
		}
		
		catch (NumberFormatException e) { // ���ڿ��� ���ڷ� ��ȯ�� �� ���� ��
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) { // ��Ÿ�� �߿� �߻��ϴ� ����
			System.out.println(e.getMessage());
		}
		
	}
}
