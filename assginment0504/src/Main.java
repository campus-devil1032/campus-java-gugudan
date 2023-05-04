import controller.CalculatorController;
import controller.GugudanController;
import model.CalculatorModel;
import view.CalculatorView;
import view.GugudanView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // 사용자 입력 받기

        while (true) {
            System.out.println("Please enter gugudan or calculator:");
            input = scanner.nextLine();

            if (input.equals("gugudan") || input.equals("calculator")) {
                break;
            }

            System.out.println("Invalid input. Please enter gugudan or calculator.");
        }

        // gugudan controller 호출

        if (input.equals("gugudan")) {

            GugudanView gugudanView = new GugudanView();
            GugudanController controller2 = new GugudanController(gugudanView);

            while(true) {
                try {
                    controller2.run();
                } catch(InputMismatchException e) {
                    gugudanView.printMessage("InputMismatchException, " + e.getMessage());
                } catch (IllegalArgumentException e){
                    gugudanView.printMessage("IllegalArgumentException, " + e.getMessage());
                }
            }

        } else {
            // calculator controller 호출

            CalculatorModel calculatorModel = new CalculatorModel();
            CalculatorView calculatorView = new CalculatorView();
            CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);

            while(true) {
                try {
                    calculatorController.run();
                } catch(ArithmeticException e) {
                    calculatorView.printErrorMessage("ArithmeticException, " + e.getMessage());
                } catch (IllegalArgumentException e){
                    calculatorView.printErrorMessage("IllegalArgumentException, " + e.getMessage());
                }
            }
        }




    }
}
