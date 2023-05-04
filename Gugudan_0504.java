package Java_mulcampus;

import java.util.Scanner;

public class Gugudan_0504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        try {
            System.out.print("구구단 중 출력할 단은? ");
            input = scanner.nextInt();
            if (input < 1 || input > 999) { // 입력한 값이 1~999 범위 밖이면 예외 발생
                throw new Exception();
            }
            System.out.println("사용자가 입력한 단: " + input + "단");
            for (int i = 1; i < 10; i++) {
                System.out.println(input * i);
            }
        } catch (Exception e) {
            System.out.println("1~999 사이의 정수를 입력해주세요.");
        }
    }
}
