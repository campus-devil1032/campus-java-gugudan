/**
 * �� �̸��� ���ڸ� �Է��ϸ� ���ϴ� ���񽺸� �����ϴ� ���α׷�
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
		return "[ȯ���մϴ�! " + name + "���Ͻô� ���񽺸� �������ּ���.]";
	}
}
