import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplication_tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("�ܼ��� �Է��ϼ���(1~9) : ");
            int dan = scanner.nextInt();
 //���� �ٺ��Դϴ�
            if (dan < 1 || dan > 9) {
                throw new InputMismatchException("1���� 9������ ������ �Է� �����մϴ�.");
            }

            System.out.println(" " + dan + "���� ����մϴ�.");

            for (int i = 0; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + dan * i);
            }
        } catch (InputMismatchException e) {
            System.out.println("������ �߻��Ͽ����ϴ�: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("�Է� �� ������ �߻��߽��ϴ�.");
        }
    }
} //�� ���⼭ ������ ����




/* �����ڵ�
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithInt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		if (isInteger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("�Է��� ���� �������Դϴ�: " + num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("�Է��� ���� �Ǽ����Դϴ�: " + num);
		} else {
			System.out.println("�Է��� ���� ���ڿ��Դϴ�: " + input);
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

*/