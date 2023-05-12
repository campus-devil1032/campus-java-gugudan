package router;

import exception.InvalidUserInput;
import model.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputRouter {

//    private controller.GugudanController gugudanController = new controller.GugudanController();
//    private controller.CalculatorController calculatorController = new controller.CalculatorController();

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
        throw new InvalidUserInput("잘못된 사용자 입력입니다.");

    }

    public int getGugudanInput() throws IOException {
        System.out.println("구구단을 출력하겠습니다 !");
        System.out.println("1 ~ 999 사이의 숫자를 입력하세요");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(!isInteger(input)){
            throw new NumberFormatException();
        }

        if (!validNumberRange(Integer.parseInt(input))) {
            throw new IllegalArgumentException("숫자를 잘못 입력했습니다. 1부터 999 사이의 숫자를 입력해 주세요!");
        }

        return Integer.parseInt(input);
    }

    public Calculator getCalculatorInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫번째 연산할 숫자를 입력해 주세요 !");
        String input1 = br.readLine();
        System.out.println("연산자를 입력해 주세요");
        String operator = br.readLine();
        System.out.println("두번째 연산할 숫자를 입력해 주세요 !");
        String input2 = br.readLine();

        if(!isInteger(input1) || !isInteger(input2)){
            throw new NumberFormatException();
        }

        Calculator calculator = new Calculator(Integer.parseInt(input1), Integer.parseInt(input2));
        calculator.setOp(operator.charAt(0));


        return calculator;
    }

    public boolean validNumberRange(int number) {
        return number >= 1 && number <= 999;
    }

    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
