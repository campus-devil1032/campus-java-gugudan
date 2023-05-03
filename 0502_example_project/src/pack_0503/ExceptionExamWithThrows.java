package pack_0503;

public class ExceptionExamWithThrows {
	public static void main(String[] args) {
		try {
			methodWithNull(); // ���⼭ �ڵ尡 ������.
			methodWithArrayIndexOutOfBounds(); // �� �κ��� ������� �ʴ´�
			methodArithmetic(); // �� �κ��� ������� �ʴ´�.
		} catch (NullPointerException e) {
			System.out.println("NullPointerException ���� �߻�: " + e.getMessage()); // �ڵ尡 ������ �� �� �帧�� �������� �Ѿ�´�.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ���� �߻�: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ���� �߻�: " + e.getMessage());
		}

		// �ռ� catch �������� ������ ó�������Ƿ� �帧�� �ٽ� �������� �Ѿ�´�.

		try {
			methodWithNull();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException ���� �߻�: " + e.getMessage());
		}

		try {
			methodWithArrayIndexOutOfBounds();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ���� �߻�: " + e.getMessage());
		}

		try {
			methodArithmetic();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ���� �߻�: " + e.getMessage());
		}

		try {
			methodWithNull(); // ���⼭ �ڵ尡 �����µ� �߸� �� Exception Catch���Ѵٸ� �Լ�ȣ���� ����ȴ�.
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ���� �߻�: " + e.getMessage()); // �� �ڵ�� Ÿ�� �ʴ´�.
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
