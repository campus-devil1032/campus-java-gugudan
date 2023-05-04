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
		this.setName(name);
		this.setNum(num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString() {
		return "[환영합니다! " + name + "원하시는 서비스를 선택해주세요.]";
	}
}
