import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorController {
    private CalculatorView view;

    public CalculatorController(CalculatorView view) {
        this.view = view;
    }

    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫번째 연산할 숫자를 입력해 주세요 !");
        String input1 = br.readLine();
        System.out.println("연산자를 입력해 주세요");
        String operator = br.readLine();
        System.out.println("두번째 연산할 숫자를 입력해 주세요 !");
        String input2 = br.readLine();

        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            char op = operator.charAt(0);
            Calculator calculator = new Calculator(num1, num2);
            calculator.setOp(op);
            view.printResult(calculator);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        } finally {
            br.close();
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
}
