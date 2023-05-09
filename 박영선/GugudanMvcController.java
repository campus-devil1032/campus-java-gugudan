
public class GugudanMvcController {
	private GugudanMvcModel model = new GugudanMvcModel();
	private GugudanMvcView view = new GugudanMvcView();

	public void run() {
		while (true) {
			try {
				int dan = view.inputdan();
				model.setDan(dan);
				int[] result = model.getResult();
				view.outputResult(dan, result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���."); 
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
