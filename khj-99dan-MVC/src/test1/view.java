package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
    	
        Controller con = new Controller();
        Gugu gugu = new Gugu();
        
        while(true) {
        	try {
        		System.out.println("������ �Է��� �ּ���.");
        		System.out.println("0�� �Է½�, �����մϴ�.");
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
                System.out.println("error : �߸��� �Է��Դϴ�.");
        }
    }
}
}