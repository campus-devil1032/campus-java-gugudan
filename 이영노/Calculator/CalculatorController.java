
public class CalculatorController {

	private CalculatorModel model;
	private CalculatorView view;
	
	CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	
	public double getFirstNum() {
		return model.getFirstaNumber();
	}
	
	public double getSecondNum() {
		return model.getSecondNumber();
	}
	
	public String getOperator() {
		return model.getOperator();
	}
	
	public double getAnswerNum() {
		return model.getAnswerNumber();
	}
	
	public void setFirstNum(double firstnum) {
	   this.model.setFirstaNumber(firstnum);
	}
	
	public void setSecondNum(double secondnum) {
		this.model.setSecondNumber(secondnum);
	}
	
	public void setOperator(String operator) {
		this.model.setOperator(operator);
	}
	
	public void setAnswerNum(double answer) {
		this.model.setAnswerNumber(answer);
	}
	
	public void updateView() {
		view.CalculatorViewDetails(model.getFirstaNumber(), model.getSecondNumber(), model.getAnswerNumber(), model.getOperator());
	}
	
	
	
	
	
	

}
