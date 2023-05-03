package MVC_Calculator;
public class Controller {
	public void isValid(String viewData,DTO dto) throws CalculatorException{
		if(viewData!=null && dto!=null) 
			dto.setStringInputData(viewData);
		else 
			throw new CalculatorException("입력값이 Null & 객체가 없어요.");
		
	}
}
