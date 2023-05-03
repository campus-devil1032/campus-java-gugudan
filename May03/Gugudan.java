package May03;

import java.util.InputMismatchException;
import java.util.Scanner;

class Gugudan2 {

    int number;

    public Gugudan2(int number) {
        this.number = number;
    }

    public void print() {
        for (int i = 1; i <= 9; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %2d\n", number, i, result);
        }
    }
}

public class Gugudan extends Gugudan2 {
    public Gugudan(int number) {
        super(number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("원하는 단수의 숫자만 입력하세요 : ");

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
        Gugudan2 gugudanTable = new Gugudan2(n);
        gugudanTable.print();
    }
}