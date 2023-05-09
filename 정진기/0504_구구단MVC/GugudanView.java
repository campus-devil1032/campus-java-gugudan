
public class GugudanView {
	
	public void getInput() {
		System.out.println("1~99사이의 계산 할 단을 입력해주세요.");
		System.out.println("\"0\"을 입력하시면 구구단 프로그램을 종료합니다.");
	}

	public void exitMassage() {
		System.out.print("구구단 프로그램을 종료합니다.");
	}
	
	public void errorMassage(String errorMassage) {
		System.out.println(errorMassage);
	}
}
