package May02;

import java.util.Scanner;

class Gugudantwo {

    int number;

    public Gugudantwo(int number) {
        this.number = number;
    }

    public void print() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}

public class Gugudanone extends Gugudantwo {
    public Gugudanone(int number) {
        super(number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("원하는 단수의 숫자만 입력하세요 : ");

        while (true) {
            n = sc.nextInt();
            if (n < 1 || n > 9) {
                System.out.print("1와 9사이의 숫자를 입력해주세요 : ");
                continue;
            }
            break;
        }
        Gugudantwo gugudanTable = new Gugudantwo(n);
        gugudanTable.print();
    }
}