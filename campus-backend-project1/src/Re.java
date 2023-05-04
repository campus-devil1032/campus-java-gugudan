class Re {// 재실행 확인 여부
	private String text;

	public Re(String text) {
		this.text = text;
	}

	public void retry() {
		if (text.equals("n")) {
			System.out.println("프로그램 종료");
			System.exit(0);// 프로그램 종료
		}
	}
}
