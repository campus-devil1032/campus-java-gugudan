import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanController {
    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        try {
            isInteger(input);

            int dan = Integer.parseInt(input);
            validNumberRange(dan);

            Gugudan gugudan = new Gugudan();
            gugudan.setDan(dan);
            System.out.println(dan + " 단을 출력합니다.");
            gugudan.print();

        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력 양식입니다. 1~ 999 사이의 숫자를 입력해 주세요");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }

    public void isInteger(String input) throws NumberFormatException{
        Integer.parseInt(input);
    }

    public void validNumberRange(int number){
        if(number < 1 || number > 999){
            throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요");
        }
    }
}
