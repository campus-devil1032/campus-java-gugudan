
public class Calcultor {
	private String number1;
	private String sign;
	private String number2;

	Calcultor(String number1, String sign, String number2) {
		this.number1 = number1;
		this.sign = sign;
		this.number2 = number2;
	}

	public void calculate() {
		int i = Integer.parseInt(number1);
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
			System.out.println("올바른 공식이 아닙니다.");
		}
	}
}
