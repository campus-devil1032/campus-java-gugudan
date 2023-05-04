package model;

public class CalculatorModel {
    private double operand1;
    private double operand2;
    private String operator;


    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch(operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if(operand2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("잘못된 operator 입니다.");
        }
    }
}
