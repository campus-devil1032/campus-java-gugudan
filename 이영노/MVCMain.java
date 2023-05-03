import java.util.Scanner;

public class MVCMain {
	public static void main(String[] args) {

		GugudanModel model = gugudanMVCDatabase();

		GugudanView view = new GugudanView();

		GugudanController controller = new GugudanController(model, view);

		controller.setView();

	}

	private static GugudanModel gugudanMVCDatabase() {
		GugudanModel GugudanModel = new GugudanModel();
		Scanner number = new Scanner(System.in); // Create a Scanner object
		System.out.println("입력할 구구단 단수를 입력하세요.");
		String inputNumber = number.nextLine();

		int intNumber = Integer.parseInt(inputNumber);
		GugudanModel.setNumberGuGudan(intNumber);

		return GugudanModel;
	}

}
