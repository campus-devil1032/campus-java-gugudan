import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorController {
    public void run() throws IOException {
        System.out.println("연산할 숫자를 입력해 주세요 !");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            String op = selectOperation();
            Calculator calculator = new Calculator(num1, num2, op);
            calculator.calculate();
        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }

    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            return false;
        }
    }

    public String selectOperation () throws IOException {
        System.out.println("***** 연산을 선택해 주세요 *****");
        System.out.println("* 기호 (+, -, /, * 로 입력해주셔야 합니다.* ");
        System.out.println("* 더하기[+]             *");
        System.out.println("* 빼기[-]               *");
        System.out.println("* 나누기[/]              *");
        System.out.println("* 곱하기[*]              *");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String op = br.readLine();

        try {
            if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")){
                return op;
            }else {
                throw new IllegalArgumentException("연산자를 잘못 입력했습니다. 확인하세요");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return op;
    }

}
