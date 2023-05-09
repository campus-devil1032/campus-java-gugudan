package Program;

public class Pro {
	private int dan;
	private int a;
	private int b;
	private int s;
	private String act = "";

	void print1() {
		System.out.println(dan + "단 출력.");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

	void print2() {
		System.out.println("계산 실행.");
		if (act.equals("+")) {
			System.out.println(a + "+" + b + "=" + (a + b));
		} else if (act.equals("-")) {
			System.out.println(a + "-" + b + "=" + (a - b));
		} else if (act.equals("*")) {
			System.out.println(a + "*" + b + "=" + (a * b));
		} else if (act.equals("/")) {
			System.out.println(a + "/" + b + "=" + (a / b));
		} else {
			System.out.println("알 수 없는 연산자입니다. ");
		}

	}

	public Pro() {

	}

	public Pro(int dan, int a, int b, int s, String act) {
		this.dan = dan;
		this.a = a;
		this.b = b;
		this.s = s;
		this.act = act;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

}
