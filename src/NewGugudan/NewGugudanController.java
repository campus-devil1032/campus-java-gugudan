
package NewGugudan;

class NewGugudanController {
	private NewGugudanModel model;
	private NewGugudanView view;

	public NewGugudanController(NewGugudanModel model, NewGugudanView view) {
		this.model = model;
		this.view = view;
	}

	public void run() {
		boolean shouldContinue = true;

		while (shouldContinue) {
			try {
				int dan = view.getDanInput();

				if (dan < 1 || dan > 9) {
					throw new IllegalArgumentException("1~9 사이의 값을 입력해주세요.");
				}

				view.displayMultiplicationTable(dan);
				model.generateMultiplicationTable(dan);


			} catch (NumberFormatException e) {
				System.out.println("1~9 사이의 정수 값을 입력해주세요.");
				
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			
				continue;
			}
			 shouldContinue = view.getContinueInput();
		}
		System.out.println("프로그램을 종료합니다.");
		view.closeScanner();
	}
}
