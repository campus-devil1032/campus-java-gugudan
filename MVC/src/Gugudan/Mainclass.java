package Gugudan;

public class Mainclass {

	public static void main(String[] args) {
		// ��ü ����, ȣ��
		GugudanModel Gugudan = new GugudanModel();
		// type, name = new O
		for (int dan = 0; dan != 1;) {
			// try-catch ���� ó��
			try {
				dan = Gugudan.inputValue(dan);
				Gugudan.outputResult();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
// view ȣ�� �ʿ�