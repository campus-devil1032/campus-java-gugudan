package MVC_Calculator;
public class DTO {
	private int inputData;
	private String stringInputData;
	private StringBuilder result;
	
	private static DTO model = new DTO();
	
	private DTO() {
		result = new StringBuilder();
	}
	
	public static DTO getInstance() {
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
	public StringBuilder getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result.append(result);
	}

	@Override
	public String toString() {
		return result.toString();
	}
	
	
}
