package mvc111;

//모델,컨트롤러,뷰 순으로 작성할것
//데이터 선언 및 이와 관련된 일 저장, 가공, 기능 (가공 다하고 출력은 view단에서 실행)
//기본적인 연산 관련 변수가 여기에 저장된다.
public class Model_Test {

	private int num; // 입력된 변수 저장용

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void showTable(int num) {
		// model_Test = new Model_Test();
		// model_Test.setNum(num);
		try {
			if (num < 1000) {
				System.out.println("입력하신의 단은" + num + "단 입니다");
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "x" + i + "=" + num * i);
				}
			} else {
				System.out.println("범위오류! 1000 이하로 입력해주세요");
			}

		} catch (NumberFormatException e) {
			num = 0; // 숫자로 변환할수 없는 문자열 형태이면 0으로 초기화
			System.out.println("문자입력오류! 정수를 입력해주세요");
		}
	}
}