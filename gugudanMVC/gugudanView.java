package gugudanMVC;

public class gugudanView {
	private gugudanController controller;
	
	public gugudanView(){
		controller = new gugudanController();
	}
	
	public void printUserDan() throws InvalidDanException {
		try {
			System.out.println("원하는 단을 입력하세요");
			int dan = controller.InputUserDan();
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d", dan, i, dan*i).println();
			}
		}catch(InvalidDanException e) {
			System.out.println(e);
		}
	}
}
