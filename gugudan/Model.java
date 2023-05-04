package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Model {

	// 구구단 값 입력받기
	public int enterIntValue() throws NumberFormatException, IOException {
		int num1 = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		num1 = Integer.parseInt(bf.readLine());
		if (num1 < 1 || num1 > 9) {
			throw new UserException();
		}
		return num1;
	}

	// 구구단 배열로 입력받기
	public int[] calculation(int num1) {
		int i, j;
		int[] k = new int[9];
		i = num1;
		for (j = 1; j < 10; j++) {
			k[j - 1] = i * j;
		}
		return k;

	}

	// 계산기 값 입력받기
	public double enterDoubleValue() throws NumberFormatException, IOException {
		double num2 = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		num2 = Double.parseDouble(bf.readLine());
		return num2;
	}

	// 계산기
	public double calculator(int num, double num1, double num2) {
		double result = 0;
		switch (num) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		case 5:
			result = num1 % num2;
			break;
		}

		return result;
	}
}

//사용자정의 예외처리 클래스
class UserException extends RuntimeException {

}
