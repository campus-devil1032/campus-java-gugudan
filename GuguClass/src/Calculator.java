import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 첫번째 값을 입력하세요.");//첫번째 값 입력 a
        int val1 = scanner.nextInt();
        System.out.println("연산을 선택해 주세요.(+, -, *, /)");//연산의 선택
        String op = scanner.next();
        System.out.println("계산한 두번째 값을 입력하세요.");//두번째 값 입력 b
        int val2 = scanner.nextInt();

        int num1 = val1;
        int num2 = val2;
        int num3;

        if (op.equals("+")) {
            num3 = num1 + num2;
        } else if (op.equals("-")) {
            num3 = num1 - num2;
        } else if (op.equals("*")) {
            num3 = num1 * num2;
        } else {
            num3 = num1 / num2;
        }
        System.out.println(val1 + op + val2 + "=" + num3);
    }
}