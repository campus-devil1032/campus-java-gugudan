package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
    	
        Controller con = new Controller();
        Gugu gugu = new Gugu();
        
        while(true) {
        	try {
        		System.out.println("정수를 입력해 주세요.");
        		System.out.println("0을 입력시, 종료합니다.");
        		con.numberInput();
        		if(con.numberInput() == 0) {
        			break;
        		}
        		else {
                		gugu.setNumber(con.numberInput());
                    	gugu.getAnswer();
        		}
        	}catch (InputMismatchException errorRes) {
        		con.numberInput();
                System.out.println("error : 잘못된 입력입니다.");
        }
    }
}
}