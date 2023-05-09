package NewGuGuDanExample;

public class Main {

	public static void main(String[] args) {

		NewGuGuDanExampleModel model = new NewGuGuDanExampleModel();
		NewGuGuDanExampleView view = new NewGuGuDanExampleView();
		NewGuGuDanExampleControllor controller = new NewGuGuDanExampleControllor(model, view);

		NewGuGuDanExampleControllor.run();
	}

}
