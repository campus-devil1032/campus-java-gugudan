import java.io.IOException;

public class GugudanView {
    public void getInput() throws IOException {
        System.out.println("구구단을 출력하겠습니다 !");
        System.out.println("1 ~ 999 사이의 숫자를 입력하세요");

        GugudanController controller = new GugudanController();
        controller.run();
    }
}
