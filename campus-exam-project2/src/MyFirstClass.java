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
				if (cond.equals("1")) {
					try {
						MultiTable mt = new MultiTable();
						mt.print();
					} catch (IOException e) {
						System.out.println("IOException!");
					}
				}
				if (cond.equals("2")) {
					try {
						Calculator c = new Calculator();
					} catch (IOException e) {
						System.out.println("IOExeption!");
					}
				}
				if (cond.equals("0")) {
					return;
				}
			} catch (IOException e1) {
				System.out.println("IOExeption!");
			}
		}
	}
}
