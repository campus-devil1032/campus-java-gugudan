public class Calcultor { // ����
	private String number1; // ����� ù��° ����
	private String sign;// ����� ��ȣ
	private String number2;// ����� �� ��° ����
	private int result;//��� ��

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

	public void calculate(String number1, String sign, String number2) { // ���� ���
		int num1 = Integer.parseInt(number1); // ù ��° �Է��� String�� int�� ��ȯ
		int num2 = Integer.parseInt(number2); // �� ��° �Է��� String�� int�� ��ȯ
		if (sign.equals("+")) { // sign�� �� ����ȣ�� ������ �� ��� �� result�� �Է�
			result = num1 + num2;
		} else if (sign.equals("-")) {
			result = num1 - num2;
		} else if (sign.equals("*")) {
			result = num1 * num2;
		} else if (sign.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println(sign + "�� �ùٸ� ������ �ƴմϴ�."); // �Է��� sign�� �ùٸ� ��ȣ�� �ƴ� �� ���
		}
	}

	public int getResult() {
		return result;
	}
}