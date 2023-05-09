package capsule_cal;


class Cap {
	private int dan;

	void print() {

		System.out.println(dan + "단 출력.");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
}
