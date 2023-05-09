
public class GuGuDan { // 구구단 계산
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		
	 }

	public void test(String number) {
		int i = Integer.parseInt(number);								//입력한  String을 int로 변환
		if (0 < i && i <= 999)											// 0부터 999안의 숫자만 입력
		{
			for (int j = 1; j < 10; j++) {
				System.out.println("	" + i + "*" + j + "=" +(i*j)); 	// 구구단 출력
			}
		} else {
			System.out.println("입력하신 숫자가 너무 크거나 음수입니다.");			//숫자가 범위 외 일때 출력
		}
	}
}