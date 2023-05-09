import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFirstClass {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cond;
		while (true) {
			System.out.println("구구단 : 1 | 계산기 : 2 | 종료 : 0");
			try {
				cond = br.readLine();
			} catch (IOException e) {
				cond = "-";
				System.out.println("IOException!");
			}

			switch (cond) {
			case "1":
				MultiTable mt = new MultiTable();
				mt.print();
				break;
			case "2":
				Calculator c = new Calculator();
				break;
			case "0":
				break;
			}
		}
	}
}
