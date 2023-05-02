import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		int step = 0;
		boolean flag = true;

		System.out.println("입력범위는 1~999입니다.");
		System.out.print("단수 입력: ");
		Scanner scan = new Scanner(System.in);

		while (flag) {
			if (!scan.hasNextInt()) {
				scan.next();
				System.err.print("숫자를 입력하세요. \n단수입력: ");
			} else {
				step = scan.nextInt();
				if (step > 0 && step < 1000)
					flag = false;
				else {
					System.err.print("1~999 사이의 숫자를 입력하세요. \n단수입력: ");
				}
			}
		}
		scan.close();
		for (int i = 1; i < 10; i++) {
			System.out.println(step + "x" + i + "=" + (step * i));
		}

	}

}
