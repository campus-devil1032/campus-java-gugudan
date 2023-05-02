package example;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		int i;
		int a = 21;
		i = a / 2;
		while (true) {

			i--;
			if (i == 1) {
				System.out.println("이 수는 소수입니다.");
				break;
			} else if (a % i == 0) {
				System.out.println("이 수는 소수가 아닙니다.");
				break;
			}

		}

	}
}
