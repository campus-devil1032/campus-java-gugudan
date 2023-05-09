package gugudanMVC;

public class gugudanRunner {

	public static void main(String[] args) throws InvalidDanException {
		gugudanController controller = new gugudanController();
		gugudanView view = new gugudanView();
		
		view.printUserDan();
	}

}
