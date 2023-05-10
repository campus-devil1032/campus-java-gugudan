package campus_java;

import java.util.*;

//문자입력시 예외처리
public class gugudan_exception {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                System.out.print("구구단 몇 단을 볼까요? : ");
                dan = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
                scanner.nextLine();
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }
    }

}
