package service;

import model.Calculator;
import router.UserInputRouter;
import view.CalculatorView;
import view.GugudanView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorService {
    private UserInputRouter uir = new UserInputRouter();
    private CalculatorView cView = new CalculatorView();

    public void run() throws IOException {
        try {
            Calculator calculator = new Calculator();
            calculator = uir.getCalculatorInput();
            cView.printResult(calculator);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
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
}
