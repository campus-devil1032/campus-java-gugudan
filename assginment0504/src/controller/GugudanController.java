package controller;

import view.GugudanView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanController {
    private GugudanView view;

    public GugudanController(GugudanView view) {
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        view.printMessage("구구단 몇 단을 계산할까요? (종료하려면 0 입력)");
        int dan;
        while (true) {
            try {
                dan = scanner.nextInt();
                if(dan == 0) {
                    view.printMessage("프로그램을 종료합니다.");
                    System.exit(0);
                }
                if (dan < 2 || dan > 9) {
                    throw new IllegalArgumentException("2-9 사이의 정수를 입력해주세요.");
                }
                break;
            } catch (InputMismatchException e) {
                scanner.next(); // 잘못된 입력 버리기
                view.printMessage("잘못된 입력입니다. 2-9 사이의 정수를 입력해주세요.");
            } catch (IllegalArgumentException e) {
                view.printMessage(e.getMessage());
            }
        }



        view.printMessage("구구단 " + dan + "단을 계산합니다.");

        for(int i = 1; i <= 9; i++) {
            int result = dan * i;
            view.printMessage(dan + " x " + i + " = " + result);
        }

    }
}
