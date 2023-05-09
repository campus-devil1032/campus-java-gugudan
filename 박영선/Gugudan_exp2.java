import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan_exp2 {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) { 
		if (num < 1 || num > 999) {
			throw new IllegalArgumentException("�Է°��� �߸� �Է��߽��ϴ�. 1~999�ܱ��� �Է��� �ּ���.");
		}
		this.num = num;
	}
	
	public void print() { 
		for(int i=1; i<=9; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gugudan_exp2 gugudan = new Gugudan_exp2();

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


