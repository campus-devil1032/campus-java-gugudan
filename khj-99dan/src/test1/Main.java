package test1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int c = 0;
        
        while(true) {
        	try {
        		System.out.println("������ �Է��� �ּ���.");
            	c = scan.nextInt();
            	if(c >= 1 && c <= 999) {
            		Cal value = new Cal(c);
            		value.getAnswer();
            		break;
            	}
            	else {
            		System.out.println("��ȿ���� ���� �����Դϴ�.");
            	}
        	}catch (InputMismatchException errorRes) {
                scan = new Scanner(System.in);
                System.out.println("error : �߸��� �Է��Դϴ�.");
        }
    }
}
}