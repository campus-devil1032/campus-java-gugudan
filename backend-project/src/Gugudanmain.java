package Gugudan;

public class Gugudanmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gugudanclass gu = new Gugudanclass(3, "hun"); // 숫자가 몇이 들어가도 돌아가는데 잘 모르겠다
		// class의 setUserName에 hun 들어감
		System.out.println(gu.getUserName());

		for (int i = 2; i <= 9; i++) { // i는 2부터 9까지
			System.out.println(i + "단 출력");
			for (int j = 1; j <= 9; j++) { // j는 1부터 9까지
				System.out.println(i + "x" + j + "=" + i * j); // 구구단 계산식
			}
			System.out.println();
		}
	}

}
