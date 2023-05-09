package May09;

public class CalculatorModel {
    public int calculate(int number1, int number2, int operator) {
        if (operator == 1) {
            return number1 + number2;
        }
        if (operator == 2) {
            return number1 - number2;
        }
        if (operator == 3) {
            return number1 * number2;
        }
        if (operator == 4) {
            return number1 / number2;
        }
        return -1;
    }
}
