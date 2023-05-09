import java.util.Scanner;

public class GugudanMvcView {
	private Scanner scanner = new Scanner(System.in);

	public int inputdan() {
		System.out.print("구구단 몇단을 출력하시겠습니까 ? ");
		int dan = Integer.parseInt(scanner.nextLine()); // 입력받은 값이 문자열로 정수로 변환하는 기능
		return dan;
	}

	public void outputResult(int dan, int[] result) {
		System.out.println(dan + "단을 출력합니다.");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d x %d = %d%n", dan, i + 1, result[i]);
        }
	}

}
