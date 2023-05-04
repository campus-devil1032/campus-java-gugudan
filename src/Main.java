import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        while(true){
            System.out.println("*** 숫자를 입력해 주세요 ! ***");
            System.out.println("*  1. 구구단             *");
            System.out.println("*  2. 계산기             *");
            System.out.println("************************");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String userInput = br.readLine();

            try {
                // 1 또는 2 입력했는지 validate
                validUserInput(userInput);

                if(userInput.equals("1")){
                    GugudanView gugudanView = new GugudanView();
                    gugudanView.getInput();
                    break;
                }else if(userInput.equals("2")){
                    System.out.println("계산기");
                    CalculatorView calculatorView = new CalculatorView();
                    calculatorView.getInput();
                    break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }

    }

    public static void validUserInput(String userInput) {
        if( !userInput.equals("1") && !userInput.equals("2")){
            throw new IllegalArgumentException("잘못 입력하셨습니다. 다시 입력해 주세요");
        }

    }

}