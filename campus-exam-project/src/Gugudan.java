package campus_java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Gugudan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dan;
        while (true) {
            try {
                System.out.print("1부터 999 사이의 정수를 입력하세요 : ");
                dan = in.nextInt();
                if (dan < 1 || dan > 999) {
                    throw new InputMismatchException(); // 예외 발생
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("입력에러 : 1 ~ 999 사이의 정수를 입력해주세요");
                in.nextLine(); // 입력값 받음
            }
        }
        for (int i = 0; i < 10; i++) { // 9번 반복
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }
}
