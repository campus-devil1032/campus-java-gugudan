package homework;
import controller.gugudanControl;
import controller.calculatorControl;
import view.gugudanView;
import view.calculatorView;
import model.gugudanModel;
import model.calculatorModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		boolean systemState = true;
		while(systemState) {
			System.out.println("������ ���� ���α׷��Դϴ�. �������� g ����� c ����� q�Դϴ� ");
			input = br.readLine();
			if(input.equals("q")) {
				break;
			}
			if(input.equals("g")) {
				System.out.println("�����ܼ��񽺷� �̵��մϴ�...");
				gugudanModel gugudanmodel = new gugudanModel();
				gugudanView gugudanview = new gugudanView();
				gugudanControl gugudancontrol = new gugudanControl();
				
			}
			if(input.equals("c")) {
				System.out.println("���� ���񽺷� �̵��մϴ�...");
//				calculatorModel calcmodel = new calculatorModel();
				calculatorView calcview = new calculatorView();
				calculatorControl calccontrol = new calculatorControl();
				calcview.calculatorView1();
				calccontrol.calculatorControl1();
				calcview.calculatorView2();
			}
			else {
				System.out.println("�߸��� �Է��Դϴ� �ٽ� �����ּ���");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

}
