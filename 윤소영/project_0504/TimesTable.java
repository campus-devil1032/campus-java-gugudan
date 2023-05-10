package project_0504;

public class TimesTable {
	
	private int num;
	
	public TimesTable(int num) {
		this.num = num;
	}
	
	public void printTimesTable() {
		try {
			printTt(num);
			System.out.println(num + "단을 출력합니다.");
			for(int i=1; i<10; i++) {
				System.out.println(num + " * " + i + " = " + num*i); // 사용자 입력값을 1~9와 곱한 식, 결과값 출력
			}
		}catch(InputOutOfBoundsException e) { // 사용자 입력값이 1~999 범위를 벗어났을 때 발생
			System.out.println("1과 999 사이의 숫자를 입력하세요.\n");
		}
	}
	
	public static void printTt(int num) throws InputOutOfBoundsException { 
		if (num <= 0 || num > 999) {
			throw new InputOutOfBoundsException();
		}
	}
}