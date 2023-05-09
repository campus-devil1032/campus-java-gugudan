package May09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorView {
    public void printResult(int result) {
        System.out.println(result);
    }

    public int[] getInputs() {
        int[] inputs = new int[3];
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("첫번째 입력값 : ");
                inputs[0] = sc.nextInt();
                System.out.print("두번째 입력값 : ");
                inputs[1] = sc.nextInt();
                System.out.print("연산 선택 : 1 더하기 / 2 빼기 / 3 곱하기 / 4 나누기 -> ");
                inputs[2] = sc.nextInt();
                if (inputs[2] == 4 && inputs[1] == 0) {
                    System.out.println("0으로는 나눌 수 없습니다. 다시 입력해주세요.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
                sc.nextLine();
            }
        }
        return inputs;
    }
}
