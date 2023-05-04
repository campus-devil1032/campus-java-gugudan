/**
 * 고객 이름과 숫자를 입력하면 원하는 서비스를 제공하는 프로그램
 * 
 * @author CR_YOO
 *
 */
public class Service {
	private String name;
	private int num;

	public Service(String name, int num) {
		this.setNum(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
