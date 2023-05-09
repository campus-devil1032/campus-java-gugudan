import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiTable {
	private int store = 0;

	public MultiTable() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1~999������ ������ �Է����ּ���");
			String str;
			try {
				str = br.readLine();
			} catch (IOException e) {
				str = "0";
				System.out.println("IOException!");
			}
			if (validateInteger(str)) {
				int temp = Integer.parseInt(str);
				if (temp >= 1 && temp <= 999) {
					this.store = temp;
					break;
				} else {
					System.out.println("������ ������ϴ�.");
				}
			} else {
				System.out.println("������ �ƴմϴ�.");
			}
		}
	}

	private boolean validateInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private int calc(int line) {
		return store * line;
	}

	public void print() {
		for (int line = 1; line <= 9; line++) { // �������� ����ϸ鼭 ���.
			System.out.printf("%d x %d = %d\n", store, line, calc(line));
		}
	}
}
