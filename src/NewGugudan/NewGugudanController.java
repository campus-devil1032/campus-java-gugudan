
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
					throw new IllegalArgumentException("1~9 ������ ���� �Է����ּ���.");
				}

				view.displayMultiplicationTable(dan);
				model.generateMultiplicationTable(dan);


			} catch (NumberFormatException e) {
				System.out.println("1~9 ������ ���� ���� �Է����ּ���.");
				
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			
				continue;
			}
			 shouldContinue = view.getContinueInput();
		}
		System.out.println("���α׷��� �����մϴ�.");
		view.closeScanner();
	}
}
