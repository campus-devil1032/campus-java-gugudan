
public class Calcultor {
	private String number1; // ����� ù��° ����
	private String sign;// ����� ��ȣ
	private String number2;// ����� �� ��° ����

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

	public void calculate(String number1, String sign,String number2) {
		int i = Integer.parseInt(number1); // �Է��� String�� int�� ��ȯ
		int j = Integer.parseInt(number2);
		if (sign.equals("+")) {
			System.out.println(i + "+" + j + "=" + (i + j));
		} else if (sign.equals("-")) {
			System.out.println(i + "-" + j + "=" + (i - j));
		} else if (sign.equals("*")) {
			System.out.println(i + "*" + j + "=" + (i * j));
		} else if (sign.equals("/")) {
			System.out.println(i + "/" + j + "=" + (i / j));
		} else {
			System.out.println("�ùٸ� ������ �ƴմϴ�."); // �Է��� sign�� �ùٸ� ��ȣ�� �ƴ� �� ���
		}
	}
}