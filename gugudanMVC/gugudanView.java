package gugudanMVC;

public class gugudanView {
	private gugudanController controller;
	
	public gugudanView(){
		controller = new gugudanController();			//컨트롤러 객체 생성
	}
	
	public void printUserDan() throws InvalidDanException {
		try {																		//사용자에게서 받은 단을 출력
			System.out.println("Enter a number");
			int dan = controller.InputUserDan();
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d", dan, i, dan*i).println();
			}
		}catch(InvalidDanException e) {			//단을 받을 때, 범위를 넘어서게되면 예외처리
			System.out.println(e);
		}
	}
}
