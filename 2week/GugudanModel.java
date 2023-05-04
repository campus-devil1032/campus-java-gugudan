package homework;

public class GugudanModel { // 데이터 가공 처리
	private String dan; // 입력받을 값
	private int[] result = new int[9]; // 결과값

	public GugudanModel(String dan) {
		this.dan = dan;
	}

	public boolean isValidDan() throws NumberFormatException{ // 입력받은 단의 값 확인
			int number = Integer.parseInt(dan);
			if (number > 999 || number < 1)
				throw new DanValueOverflowException("잘못된 범위입니다.");
			return true;
	}
		

	public String getDan() {
		return dan;
	}

	public void setDan(String dan) {
		this.dan = dan;
	}

	public int[] getResult() {
		for (int j = 1; j <= 9; j++) { // 입력받은 단으로 구구단을 구함
			result[j - 1] = Integer.parseInt(this.dan) * j;
		}
		return result;
	}
}
