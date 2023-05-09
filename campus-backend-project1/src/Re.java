class Re {																	// 재실행 확인 여부
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void retry(text) {
		if (text.equals("n")) {												// 입력받은 문자가 n일시
			System.out.println("프로그램 종료");
			System.exit(0);													// 프로그램 종료
		}
	}
}
