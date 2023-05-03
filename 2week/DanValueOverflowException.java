package homework;

public class DanValueOverflowException extends RuntimeException {
private static final long serialVersionUID = 1L;

	public DanValueOverflowException() {
			System.out.println("잘못된 범위입니다.");	
	}
}
