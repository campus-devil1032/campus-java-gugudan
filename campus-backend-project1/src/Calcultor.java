public class Calcultor { // 계산기
	private String number1; // 계산할 첫번째 숫자
	private String sign;// 계산할 기호
	private String number2;// 계산할 두 번째 숫자
	private int result;//계산 값

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumer2(String number2) {
		this.number2 = number2;
	}

	public void calculate(String number1, String sign, String number2) { // 계산및 출력
		int num1 = Integer.parseInt(number1); // 첫 번째 입력한 String을 int로 변환
		int num2 = Integer.parseInt(number2); // 두 번째 입력한 String을 int로 변환
		if (sign.equals("+")) { // sign이 각 계산기호와 같으면 그 계산 값 result에 입력
			result = num1 + num2;
		} else if (sign.equals("-")) {
			result = num1 - num2;
		} else if (sign.equals("*")) {
			result = num1 * num2;
		} else if (sign.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println(sign + "은 올바른 공식이 아닙니다."); // 입력한 sign이 올바른 기호가 아닐 시 출력
		}
	}

	public int getResult() {
		return result;
	}
}