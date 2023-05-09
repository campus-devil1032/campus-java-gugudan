package gugudanMVC;

public class gugudanModel {
	private int dan;

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) throws InvalidDanException{
		if(dan >= 1 && dan <= 999) {
			this.dan = dan;
		}else {					//단이 범위를 넘어서게되면 예외를 발생시킴
			throw new InvalidDanException("Number out of range. "
					+ "plese Enter a number between 1 and 999");
		}
	}
}
