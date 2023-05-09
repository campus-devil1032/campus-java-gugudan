package a;


import java.util.Scanner;

public class Cal {

	 
    private int num1, num2, result;  //첫번째 숫자, 두번째 숫자, 결과값 변수 지정
    private char op; //연산자 변수 지정

public static void main(String args[]) {
    
	Cal cal = new Cal(); 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("input number1 :"); //첫번째 숫자 입력
    cal.setNum1(sc.nextInt());
    System.out.println("input oper :"); //연산자 입력
    cal.setOp(sc.next().charAt(0));
    System.out.println("input number2 :"); //두번째 숫자
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