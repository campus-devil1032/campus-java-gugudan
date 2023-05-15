package GugudanProject;

import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        GugudanView.printStart();

        int dan;
        while (true) {
            try {
                dan = in.nextInt();
                if (dan < 1 || dan > 999) { // 1 ~ 999 사이가 아닐땨
                    throw new GugudanError(); // catch 문으로 이동
                } else {
                    break;
                }
            } catch (GugudanError e) {
                System.out.println("입력에러 : 1 ~ 999 사이의 정수를 입력해주세요");
                in.nextLine(); // 에러발생 후 다시 사용자 입력 값 받음
            }
        }

        GugudanController controller = new GugudanController(dan); // controller에 dan 전
        controller.gugudanController();  // controller에 gugudanController 메서드
    }
}