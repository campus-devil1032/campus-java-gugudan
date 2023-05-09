
public class GugudanMvcModel {
	private int dan;
	private int[] result;
	
	private int[] calculate(int dan) { // 구구단 계산식 생성
		int[] result = new int[9];
		for(int i =0; i<result.length; i++) {
			result[i] = dan*(i+1);
		}
		return result;
	}
	
	
	
	public void setDan(int dan) { // 입력 유효범위 정하고, 유효하지 않으면 메세지발동, 유효하면 계산하도록 메서드 생성
		if(dan < 1 || dan > 999) {
			throw new IllegalArgumentException("구구단은 1단부터 999단까지 가능합니다.");
		}
		this.dan = dan;
		this.result = calculate(dan);
	}
	
	public int getDan() {
		return dan;
	}
	
	public int[] getResult() {
		return result;
	}
	
	
}
