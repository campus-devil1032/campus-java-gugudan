
public class Model {
	private int inputData;
	private String stringInputData;
	private String result="";
	
	private static Model model = new Model();
	
	private Model() {}
	
	public static Model getInstance() {
		return model;
	}
	
	public String getStringInputData() {
		return stringInputData;
	}
	public void setStringInputData(String stringInputData) {
		this.stringInputData = stringInputData;
	}
	public int getInputData() {
		return inputData;
	}
	public void setInputData(int inputData) {
		this.inputData = inputData;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return result;
	}
	
}
