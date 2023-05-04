public class Calculator {
    private int num1;
    private int num2;
    private String op;

    public Calculator() {
    }

    public Calculator(int num1, int num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void calculate(){
        int result;
        switch (op){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자네요 ^-^...");
                return;

        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
