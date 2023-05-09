
public class GugudanView {

	public void createGugudanMVC(int num) {
		System.out.printf("구구단 %d단을 시작합니다.%n", num);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d단 : %d X %d = %d%n", num,  num, i,  num * i);
		}
		System.out.println("계산을 종료합니다.");
	}
}
