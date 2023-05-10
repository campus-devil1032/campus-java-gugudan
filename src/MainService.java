import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainService {

    private UserInputRouter uir = new UserInputRouter();
    private ApplicationController ac = new ApplicationController();
    private MainView view = new MainView(); // TODO : 이게 여기가 맞나? 재검토 필요

    public void start() {

        try {
            while (true) {
                try {
                    int programType = uir.getUserInput();
                    if (programType == 1) {
                        ac.doGugudan();
                        break;
                    } else if (programType == 2) {
                        ac.doCalculator();
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } catch (InvalidUserInput e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void validUserInput(String userInput) throws IllegalArgumentException {
        if (!userInput.equals("1") && !userInput.equals("2")) {
            throw new IllegalArgumentException("잘못 입력하셨습니다. 다시 입력해 주세요");
        }
    }
}

class Main {
    public static void main(String[] args) {

        // Service Start ! CLASS
        MainService mainService = new MainService();
        mainService.start();

    }

}