import java.util.Scanner;

public class GugudanModel {
	private int GugudanAnswer;
	
	public GugudanModel() {
		Scanner number = new Scanner(System.in); 
		System.out.println("입력할 구구단 단수를 입력하세요.");
		String inputNumber = number.nextLine();
		int intNumber = Integer.parseInt(inputNumber);
		this.GugudanAnswer = intNumber;
	}

	
	
	public int getAnswer() {
		return GugudanAnswer;
	}
	
	public void setAnswer(int answer) {
		GugudanAnswer = answer;
		
	}
}
