/**
 * 숫자를 입력하면 원하는 서비스를 제공하는 프로그램
 * 
 * @author CR_YOO
 *
 */
public class Service {
	private int num;
	private int dan;

	public Service(int num) {
		this.setNum(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

}
