
public class Main {
	public static void main(String[] args) {
		/**
		 * 구구단 프로세스
		 */
		GuguClass guguObject = new GuguClass(1);
		guguObject.setUserName("유채림");
		System.out.println(guguObject.getUserName());
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
