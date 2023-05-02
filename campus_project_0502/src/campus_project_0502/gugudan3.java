package campus_project_0502;

import java.util.Scanner;

public class gugudan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("구구단 단수를 입력하세요 = ");

		int dan = sc.nextInt();

		System.out.println(dan + "단");

		if (dan >= 1) {
			for (int i = 1; i < 10; i++)
				System.out.println(dan + "X" + i + "=" + dan * i);
		} else {
			System.out.println("입력 오류입니다!");
		}

	}
}

class ExceptionEx

{

	public static void main(String args[])

	{

		try {

			if (dan < 0 || dan > 999) {
				throw new Exception("입력범위 '1 ~ 999'를 벗어났습니다.");

		} catch (Exception e) {

			System.out.println("에러 메시지 : " + e.getMessage());

			e.printStackTrace();

		}

		System.out.println("프로그램이 정상 종료되었음.");

	}

}
