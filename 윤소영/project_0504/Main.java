package project_0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		
		int menuNum = 1;
		while(true) {
			System.out.print("����� ����� ��ȣ�� �Է��ϼ���.(0 �Է½� ����)\n1. ����\n2. ������ ���\n> ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			menuNum = Integer.parseInt(br.readLine());
	
			if(menuNum == 1) { // ����
				System.out.print("������ �Է����ּ���. (ex. 1 + 2)\n> ");
				String exp = br.readLine();
				
				Calculator calc = new Calculator();
				calc.calculate(exp);
				
			}else if(menuNum == 2) { // ������ ���
				int num = 0;
				System.out.print("����� �� ���� �Է��ϼ��� > ");
				num = Integer.parseInt(br.readLine());
				
				TimesTable tt = new TimesTable(num);
				tt.printTimesTable();
				
			}else if(menuNum == 0){ // 0 �Է½� while�� ���������� ����
				break;
			}else { // 0, 1, 2 ���� ��ȣ �Է½� ��ȣ ���Է� ��û
				System.out.println("��ȿ�� ��ȣ�� �Է����ּ���.\n");
			}
		}
	}
}