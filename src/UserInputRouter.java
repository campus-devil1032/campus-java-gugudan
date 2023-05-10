import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputRouter {

    private GugudanController gugudanController = new GugudanController();
    private CalculatorController calculatorController = new CalculatorController();

    public int getUserInput() throws IOException, InvalidUserInput {

        System.out.println("*** 숫자를 입력해 주세요 ! ***");
        System.out.println("*  1. 구구단             *");
        System.out.println("*  2. 계산기             *");
        System.out.println("************************");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();
        if (userInput.equals("1")) {
            return 1; // TODO : ENUM으로 만들어보기!
        } else if (userInput.equals("2")) {
            return 2; // TODO : ENUM으로 만들어보기!
        }
        throw new InvalidUserInput();

    }


}
