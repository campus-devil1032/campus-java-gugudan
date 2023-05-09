package May09;

import java.util.Scanner;

public class GugudanAndCalMain {
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

        if (select == 1) {
            System.out.print("원하시는 단수를 입력하세요(1~9사이 숫자 입력) : ");
            int n = sc.nextInt();
            GugudanController controller = new GugudanController();
            controller.run(n);
        } else if (select == 2) {
            // 계산기 프로그램 실행
            CalculatorController calculatorController = new CalculatorController();
            calculatorController.run();
        }
        sc.close();
    }
}
