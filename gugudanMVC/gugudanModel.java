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
			throw new InvalidDanException("범위에서 벗어난 값입니다. "
					+ "1에서 999 사이의 값을 입력하세요.");
		}
	}
}
