package service;

import model.Gugudan;
import router.UserInputRouter;
import view.GugudanView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanService {

    private UserInputRouter uir = new UserInputRouter();
    private GugudanView gView = new GugudanView();

    public void run() throws IOException {
        try {
            int dan = uir.getGugudanInput();
            Gugudan gugudan = new Gugudan();
            gugudan.setDan(dan);

            gView.printResult(gugudan);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하지 않으셨습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
        }
    }
}
