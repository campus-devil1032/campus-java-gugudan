package pack_0503;

public class ExceptionExamWithThrows {
	public static void main(String[] args) {
		try {
			methodWithNull(); // 여기서 코드가 터진다.
			methodWithArrayIndexOutOfBounds(); // 이 부분은 실행되지 않는다
			methodArithmetic(); // 이 부분은 실행되지 않는다.
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생: " + e.getMessage()); // 코드가 터지고 난 후 흐름이 이쪽으로 넘어온다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생: " + e.getMessage());
		}

		// 앞서 catch 구문에서 에러를 처리했으므로 흐름은 다시 이쪽으로 넘어온다.

		try {
			methodWithNull();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생: " + e.getMessage());
		}

		try {
			methodWithArrayIndexOutOfBounds();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생: " + e.getMessage());
		}

		try {
			methodArithmetic();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생: " + e.getMessage());
		}

		try {
			methodWithNull(); // 여기서 코드가 터지는데 잘못 된 Exception Catch를한다면 함수호출이 종료된다.
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생: " + e.getMessage()); // 이 코드는 타지 않는다.
		}

	}

	public static void methodWithNull() throws NullPointerException {
		String s = null;
		s.length();
	}

	public static void methodWithArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		arr[5] = 10;
	}

	public static void methodArithmetic() throws ArithmeticException {
		int a = 10 / 0;
	}
}
