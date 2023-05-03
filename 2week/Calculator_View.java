package homework;

public class Calculator_View {	//view
	int[] result;
	String[] viewResult;
	Calculator_Model model;
	
	public Calculator_View(Calculator_Model model) {
		System.out.println(model.getDan()+"단을 출력합니다.");
		this.model = model;
	}
	public void viewResult() {
		for(int i =0; i<model.getResult().length;i++)
			System.out.printf("%s * %d = %d%n",model.getDan(),i+1,model.getResult()[i]);
	}
}
