public class GuGuDan { // 구구단 계산
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		int num = Integer.parseInt(number); // 입력한 String을 int로 변환
		if (0 < num && num <= 999) // 0부터 999안의 숫자만 입력
		{
			for (int dan = 1; dan < 10; dan++) {
				System.out.println("	" + num + "*" + dan + "=" + (num * dan)); // 구구단 출력
			}
		} else {
			System.out.println("입력하신 숫자가 너무 크거나 음수입니다."); // 숫자가 범위 외 일때 출력
		}
	}
}