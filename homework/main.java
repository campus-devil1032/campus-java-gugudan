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
			System.out.println("구구단 계산기 프로그램입니다. 구구단은 g 계산기는 c 종료는 q입니다 ");
			input = br.readLine();
			if(input.equals("q")) {
				break;
			}
			if(input.equals("g")) {
				System.out.println("구구단서비스로 이동합니다...");
				gugudanModel gugudanmodel = new gugudanModel();
				gugudanView gugudanview = new gugudanView();
				gugudanControl gugudancontrol = new gugudanControl();
				
			}
			if(input.equals("c")) {
				System.out.println("계산기 서비스로 이동합니다...");
//				calculatorModel calcmodel = new calculatorModel();
				calculatorView calcview = new calculatorView();
				calculatorControl calccontrol = new calculatorControl();
				calcview.calculatorView1();
				calccontrol.calculatorControl1();
				calcview.calculatorView2();
			}
			else {
				System.out.println("잘못된 입력입니다 다시 눌러주세요");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

}
