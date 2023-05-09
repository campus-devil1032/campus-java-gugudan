package a;


import java.util.Scanner;

public class Cal {

	 
    private int num1, num2, result;  //ù��° ����, �ι�° ����, ����� ���� ����
    private char op; //������ ���� ����

public static void main(String args[]) {
    
	Cal cal = new Cal(); 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("input number1 :"); //ù��° ���� �Է�
    cal.setNum1(sc.nextInt());
    System.out.println("input oper :"); //������ �Է�
    cal.setOp(sc.next().charAt(0));
    System.out.println("input number2 :"); //�ι�° ����
    cal.setNum2(sc.nextInt());
            
    cal.setResult(cal.oper(cal.getNum1(), cal.getOp(), cal.getNum2())); 
    
    System.out.println(cal.getResult()); 
    
}

public int oper(int num1, char op, int num2) {        //oper
    
    if (op == '+') { 
        return num1 + num2 ;
    } else if (op == '-') {
        return num1 - num2 ;
    } else if (op == '*') {
        return num1 * num2 ;
    } else  {
        return num1 / num2 ;
    }
    
}
public int getNum1() {  
    return num1;
}

public void setNum1(int num1) {
    this.num1 = num1;
}

public int getNum2() {
    return num2;
}

public void setNum2(int num2) {
    this.num2 = num2;
}

public char getOp() {
    return op;
}

public void setOp(char op) {
    this.op = op;
}

public int getResult() {
    return result;
}

public void setResult(int result) {
    this.result = result;
}

}