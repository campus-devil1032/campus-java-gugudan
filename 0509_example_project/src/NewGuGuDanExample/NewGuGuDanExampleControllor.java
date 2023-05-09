package NewGuGuDanExample;

import java.util.Scanner;

public class NewGuGuDanExampleControllor {

	private static NewGuGuDanExampleModel model;
	private static NewGuGuDanExampleModel view;

	private static Scanner sc = new Scanner(System.in);
	public static String input;

	public NewGuGuDanExampleControllor(NewGuGuDanExampleModel model, NewGuGuDanExampleView view) {
	}

	public static void run() {

		NewGuGuDanExampleView.firstScreen();

		input = sc.next();
		if (input.equals("q")) {
			NewGuGuDanExampleModel.exitMessege();
			System.exit(0);
		}

		model.setInput(input);
		NewGuGuDanExampleModel.getInput();

	}

}
