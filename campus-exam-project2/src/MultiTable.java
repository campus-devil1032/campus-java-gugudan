import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiTable {

	public MultiTable() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1~999사이의 정수를 입력해주세요");
			String str = br.readLine();
			if (CheckInteger(str)) {
				int temp = Integer.parseInt(str);
				if (temp > 0 && temp < 1000) {
					this.store = temp;
					break;
				} else
					System.out.println("범위를 벗어났습니다.");
			} else
				System.out.println("정수가 아닙니다.");

		}
		br.close();
	}

	private boolean CheckInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public void Print() {
		for (int i = 1; i < 10; i++)
			System.out.printf("%d x %d = %d\n", store, i, store * i);
	}

	public int store = 0;
}
