package test1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
    	
        Controller con = new Controller();
        Gugu gugu = new Gugu();
        
        while(true) {
        	try {
        		System.out.println("������ �Է��� �ּ���.");
        		System.out.println("0�� �Է½�, �����մϴ�.");
        		con.numberInput(); // �Է��� controllerŬ�������� �ذ�
        		if(con.numberOutput() == 0) { // controller���� �Էµ� ���� 0�̶�� ����
        			System.out.println("���α׷��� �����մϴ�.");
        			break; 
        		}
        		else { // 0�� �ƴ� ��������� ���ϰ��
                		gugu.setNumber(con.numberOutput()); // �Էµ� ���� ������ Ŭ������ ������
                    	gugu.getAnswer(); // �� ������ �������� ����ش޶�!
        		}
        	}catch (InputMismatchException errorRes) {
        		con.numberInput(); // ���� ����ó���� ���� ����� ���ظ� ���� �� �����ϴ� ��
                System.out.println("error : �߸��� �Է��Դϴ�.");
        }
    }
}
}