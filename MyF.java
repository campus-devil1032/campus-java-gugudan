import java.util.Scanner;


public class MyF {

	public static void main(String[] args) {
		// 기본 main 코드
		Scanner scanner = new Scanner(System.in);
		
		int dan = 0; //검색할때 이렇게하던데
		while (true) {
			System.out.print("출력할 단 수를 입력하세요 (1~999): ");
			try {
				dan = scanner.nextInt();
				if (dan <1 || dan > 999) {
					throw new Exception("입력이 유효하지 않습니다.");
				}	//try catch 도전?
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
		
		for (int i=1; i <=9; i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
		}
	}
}
		// 문제
		// 1단부터 9단까지 출력한다.
		// optinal: 유저에게 단 수를 입력받는다.
		//			이 경우 1~999까지의 입력만 유효하게 예외처리한다.
		// optional: 비즈니스 로직 분리 해보세요. View 단과 비즈니스 로직 클래스를 따로 생성해서 코드를 메인에서 분리해보세요
		