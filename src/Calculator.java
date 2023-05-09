public class Calculator {
    private int num1;
    private int num2;
    private char op;

    public Calculator() {
    }

    public Calculator(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public void calculate(){
        int result;
        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자네요 ^-^...");
                return;

        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            this.op = op;
        } else {
            throw new IllegalArgumentException("선택자를 잘못 입력하셨습니다. " + op);
        }
    }

}
