import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan_exp {

	public static void main(String[] args) throws IOException {
		    	Scanner scanner = new Scanner(System.in);
		    	
		    	try {
		    		System.out.println("����� �������� �Է��ϼ���(1~999�ܱ���) : ");
		    		int dan = scanner.nextInt();
		    		
		    		if(dan<1 || dan>999) {
		    			throw new IllegalArgumentException("1���� 999�ܱ����� �Է� �����մϴ�.");
		    		} //if�������� true��� ���ܵ����Ͽ� ���������.
		    		for(int i = 1; i <=9; i++) {
		    			System.out.println(dan + "x" + i + "=" + (dan*i));
		    		}
		    	} catch (InputMismatchException e) {
		    		throw new IOException("���ڸ� �Է����ּ���.");
		    	}
		    
		    
		    }
}
