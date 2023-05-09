package GugudanCalculaotrMVC;

/**
 * 
 * 구구단 출력 모델 :
 * 입력한 단 수와 구구단이 출력됩니다.
 * 
 * @author shmty
 *
 */

public class GugudanModel {
	
	private int num;

	public GugudanModel(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getTable() {
		StringBuilder sb = new StringBuilder();
		System.out.println("*****" + num + "단*****");
		for (int i = 1; i <= 9; i++) {
			sb.append(num)			// 입력한 단 수
				.append(" x ")		// 곱하기
				.append(i)			// 1~9까지 반복하는 부분
				.append(" = ")		// 등호
				.append(num * i)	// 단수 * i의 결과값
				.append("\n");		// 줄바꿈
		}
		return sb.toString();
	}
}
