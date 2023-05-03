package GugudanMVC;

public class Model {
	
	private int num;

	public Model(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getTable() {
		StringBuilder sb = new StringBuilder();
		System.out.println("*****" + num + "´Ü*****");
		for (int i = 1; i <= 9; i++) {
			sb.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
		}
		return sb.toString();
	}
}
