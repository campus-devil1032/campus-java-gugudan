package gugudanMVC;

public class gugudanModel {
	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) throws InvalidDanException{
		if(dan >= 1 && dan <= 999) {
			this.dan = dan;
		}else {
			throw new InvalidDanException("�������� ��� ���Դϴ�. "
					+ "1���� 999 ������ ���� �Է��ϼ���.");
		}
	}
}
