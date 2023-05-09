
public class GugudanView {

	public void createGugudanMVC(int num) {
		if (num > 0) {
		System.out.printf("구구단 %d단을 시작합니다.%n", num);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d단 : %d X %d = %d%n", num,  num, i,  num * i);
		}
		System.out.println("계산을 종료합니다.");
		}
		throw new IllegalArgumentException("잘못된 숫자입니다" + num);
	}
}
