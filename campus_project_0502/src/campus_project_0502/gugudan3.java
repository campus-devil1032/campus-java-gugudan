package campus_project_0502;

import java.util.Scanner;
import java.io.IOException;

public class gugudan3 {
	public void print() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		System.out.println("구구단 단수를 입력해주세요 : ");
		while (true) {
			try {
				dan = sc.nextInt();
				if (dan >= 1 && dan <= 999) {
					for (int i = 1; i < 10; i++) {
						System.out.println(dan + "X" + i + "=" + dan * i);
					}
					break;
				} else {
					System.out.println("입력오류!");
				}
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("1~999 범위의 정수를 입력해주세요.");

			}
		}
	}

	public static void main(String[] args) throws IOException {
		gugudan3 in = new gugudan3();
		in.print();
	}
}
