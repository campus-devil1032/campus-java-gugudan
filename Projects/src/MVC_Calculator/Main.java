package MVC_Calculator;
public class Main {
	public static void main(String[] args) {
		DTO dto = DTO.getInstance();
		View view = new View();
		Controller controller = new Controller();
		Model model = new Model();


		String viewData = view.inputView();

		try {
			controller.isValid(viewData,dto);			
			model.isValid(dto);
		}
		catch (CalculatorException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			dto.setResult("Integer.parseInt의 유효값이 아니에요.");
			e.printStackTrace();
		}
		catch(OutofNumberException e) {
			e.printStackTrace();
		}
		
		view.outPutView(dto);
	}
}