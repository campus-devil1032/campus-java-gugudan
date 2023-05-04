
public class BMICalcController {

	private BMICalculator model;
	private BMICalcView view;
	
	
	public BMICalcController(BMICalculator model, BMICalcView view) {
		this.model = model;
		this.view = view;
	}
	
	
	public double getTotal() {
		return model.getTotal();
	}
	
	public void setTotal(double total) {
		this.model.setTotal(total);
	}
	
	public void updateView() {
		view.MBICalcDetails(model.getTotal());
	}
	
	
}
