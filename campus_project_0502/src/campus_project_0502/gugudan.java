package campus_project_0502;

public class gugudan {
	public static void main(String[] args) {
		// for (초기값; 종료여부; 증감값), 1단부터 실행, 반복문 1번 돌면 1씩 증가.
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");

			// j는 i에 곱해주는 수. 9까지 곱하고 난 후 i+1인 수를 다시 1-9까지 곱함.
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
