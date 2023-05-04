package MVC_gugudan;

import java.util.Scanner;

public class GugudanView {
    private Scanner scanner;

    public GugudanView() {
        scanner = new Scanner(System.in);
    }

    public int getInput() {
        System.out.print("구구단 중 출력할 단은? ");
        return scanner.nextInt();
    }

    public void printResult(int input) {
        System.out.println("사용자가 입력한 단: " + input + "단");
    }

    public void printGugudan(int result) {
        System.out.println(result);
    }

    public void printError() {
        System.out.println("1~999 사이의 정수를 입력해주세요.");
    }
}
