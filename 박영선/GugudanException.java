import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanException {

	private int num; //����ڷκ��� �Է¹��� �ܼ�

	public void print() { 
		for(int i=1; i<=9; i++) { //  i�� 1~9���� ��
			System.out.println(num+"x"+i+"="+(num*i)); // ����ڰ� �Է��� �ܼ��� ������ ������ ��
		}
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) { 
		if (num < 1 || num > 999) { // num�� 1�̸��̰ų�, 999�ʰ��̸� �� 
			throw new IllegalArgumentException("�Է°��� �߸� �Է��߽��ϴ�. 1~999�ܱ��� �Է��� �ּ���."); // �߸��Է��ϸ� ���ܸ޼��� ����
		}
		this.num = num;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GugudanException gugudan = new GugudanException();

		while (true) {
			try {
				System.out.print("�������� �Է��ϼ��� : ");
				int num = Integer.parseInt(scanner.nextLine());
				gugudan.setNum(num);
				break;
			} catch (NumberFormatException e) {
				System.out.println("�������� 1~999�ܱ����� �Է����ּ���."); // �� ������ ���� ������ �ɱ�?
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		gugudan.print();
		
	}
}


