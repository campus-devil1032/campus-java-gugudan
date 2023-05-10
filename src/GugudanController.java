import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanController {
    private GugudanView view;

    public GugudanController(GugudanView view) {
        this.view = view;
    }

    public void run() throws IOException {
        view.getInputMessage();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        try {
            int dan = Integer.parseInt(input);
            if(!validNumberRange(dan)){
                throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
            }

            Gugudan gugudan = new Gugudan();
            gugudan.setDan(dan);

            view.printResult(gugudan);

        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하지 않으셨습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
        } catch (IllegalArgumentException e) {
            System.out.println("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
        } finally {
            br.close();
        }
    }

    public boolean validNumberRange(int number){
        return number >= 1 && number <= 999;
    }
}
