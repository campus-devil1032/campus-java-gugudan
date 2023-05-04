import java.util.Scanner;

public class CalculatorView {

	
	public void CalculatorViewDetails(double firstnum, double secondnum,double answer, String operator) {
		
		
		try {
		System.out.println("계산결과: " + firstnum + " " + operator + " " + secondnum + " = " + answer);
		System.out.println("계산 종료");
		} catch (Exception e) {
			System.out.println("Error:> "+e.getMessage());
		}
	}
}
