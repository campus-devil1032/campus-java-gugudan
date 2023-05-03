
public class gugudan {
	private int dan;

	public gugudan() {

	}

	public gugudan(int dan) {
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void print() {
		System.out.println("Model.");
		System.out.println(dan + "단 출력.");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}
