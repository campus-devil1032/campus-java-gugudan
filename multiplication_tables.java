import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplication_tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("단수를 입력하세요(1~9) : ");
            int dan = scanner.nextInt();
 //저는 바보입니다
            if (dan < 1 || dan > 9) {
                throw new InputMismatchException("1부터 9사이의 정수만 입력 가능합니다.");
            }

            System.out.println(" " + dan + "단을 출력합니다.");

            for (int i = 0; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + dan * i);
            }
        } catch (InputMismatchException e) {
            System.out.println("변수가 발생하였습니다: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("입력 중 문제가 발생했습니다.");
        }
    }
} //왜 여기서 오류가 날까




/* 예제코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithInt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		if (isInteger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("입력한 값은 정수형입니다: " + num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("입력한 값은 실수형입니다: " + num);
		} else {
			System.out.println("입력한 값은 문자열입니다: " + input);
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