package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int c = 0;
        
        while(true) {
        	try {
        		System.out.println("정수를 입력해 주세요.");
            	c = scan.nextInt();
            	if(c >= 1 && c <= 999) {
            		Cal value = new Cal(c);
            		value.getAnswer();
            		break;
            	}
            	else {
            		System.out.println("유효하지 않은 숫자입니다.");
            	}
        	}catch (InputMismatchException errorRes) {
                scan = new Scanner(System.in);
                System.out.println("error : 잘못된 입력입니다.");
        }
    }
}
}