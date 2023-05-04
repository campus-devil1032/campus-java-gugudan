
public class Calcultor {
	private String number1;
	private String sign;
	private String number2;	

	public Calcultor(String number1, String sign, String number2) {
		this.number1 = number1;										//계산할 첫번째 숫자
		this.sign = sign;											//계산할 기호
		this.number2 = number2;										//계산할 두 번째 숫자
	}

	public void calculate() {
		int i = Integer.parseInt(number1);							//입력한  String을 int로 변환
		int j = Integer.parseInt(number2);
		if (sign.equals("+")) {
			System.out.println(i + "+" + j + "=" + (i + j));
		} else if (sign.equals("-")) {
			System.out.println(i + "-" + j + "=" + (i - j));
		} else if (sign.equals("*")) {
			System.out.println(i + "*" + j + "=" + (i * j));
		} else if (sign.equals("/")) {
			System.out.println(i + "/" + j + "=" + (i / j));
		}
		else {
			System.out.println("올바른 공식이 아닙니다.");					//입력한 sign이 올바른 기호가 아닐 시 출력
		}
	}
}