package Gugudan;

public class Mainclass {

	public static void main(String[] args) {
		// 객체 생성, 호출
		GugudanModel Gugudan = new GugudanModel();
		// type, name = new O
		for (int dan = 0; dan != 1;) {
			// try-catch 예외 처리
			try {
				dan = Gugudan.inputValue(dan);
				Gugudan.outputResult();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
// view 호출 필요