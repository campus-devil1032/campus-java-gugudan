package May04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanAndCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실행 하고자하는 프로그램을 선택하세요 (숫자입력)");
        System.out.println("1 : 구구단 프로그램 / 2 : 계산기 프로그램");
        System.out.print("실행 프로그램 : ");
        int select = sc.nextInt();
        while (select != 1 && select != 2) {
            System.out.print("실행 프로그램 : ");
            select = sc.nextInt();
        }

        int n = 0;

        if (select == 1) {
            System.out.print("원하시는 단수를 입력하세요(1~9사이 숫자 입력) : ");
            while (true) {
                try {
                    n = sc.nextInt();
                    if (n < 1 || n > 9) {
                        System.out.print("1와 9사이의 숫자를 입력해주세요 : ");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("숫자만 입력이 가능합니다. 다시 입력해주세요 : ");
                    sc.nextLine();
                }
            }
            MultiplicationTable mt = new MultiplicationTable();
            mt.gugudanPrint(n);

        } else if (select == 2) {
            int num1 = 0;
            int num2 = 0;
            int operator = 0;

            while (true) {
                try {
                    System.out.print("첫번째 입력값 : ");
                    num1 = sc.nextInt();
                    System.out.print("두번째 입력값 : ");
                    num2 = sc.nextInt();
                    System.out.print("연산 선택 : 1 더하기 / 2 빼기 / 3 곱하기 / 4 나누기 -> ");
                    operator = sc.nextInt();
                    if (operator == 4 && num2 == 0) {
                        System.out.println("0으로는 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("숫자만 입력이 가능합니다. 다시 입력해주세요. ");
                    sc.nextLine();
                }
            }
            Calculator cal = new Calculator();
            int result = cal.calPrint(num1, num2, operator);
            System.out.println(result);
        }
    }

    static class MultiplicationTable {
        public void gugudanPrint(int number) {
            for (int i = 1; i <= 9; i++) {
                int result = number * i;
                System.out.printf("%d X %d = %2d\n", number, i, result);
            }
        }
    }

    static class Calculator {
        public int calPrint(int number1, int number2, int number3) {
            if (number3 == 1) {
                return number1 + number2;
            }
            if (number3 == 2) {
                return number1 - number2;
            }
            if (number3 == 3) {
                return number1 * number2;
            }
            if (number3 == 4) {
                return number1 / number2;
            }
            return -1;
        }
    }
}
