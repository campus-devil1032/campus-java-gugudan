package May09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanView {
    public void printResult(int[] results, int n) {
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d X %d = %d\n", n, (i + 1), n * (i + 1));
        }
    }



    public int getInput() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("원하시는 단수를 입력하세요(1~9사이 숫자 입력) : ");
                n = sc.nextInt();
                if (n < 1 || n > 9) {
                    System.out.println("1과 9사이의 숫자를 입력해주세요.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
                sc.nextLine();
            }
        }
        return n;
    }
}
