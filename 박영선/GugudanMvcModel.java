
public class GugudanMvcModel {
	private int dan;
	
	public int getDan() {
		return dan;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public int[] calculate() {
		int[] result = new int[9];
		for(int i =1; i<=9; i++) {
			result[i-1] = dan*i;
		}
		return result;
	}
}
