package gugudan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Model {
	class UserException extends RuntimeException {
		public UserException(String a) {
			super(a);
		}
	}
	
	public int enterValue() {
		int num1 = 0 ;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			num1 = Integer.parseInt(bf.readLine());
			if (num1 < 1 || num1 > 10) {
				throw new UserException("1~9사이만 입력하세요");
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		return num1;
	}

	public int[] calculation(int num1) {
		int i,j;
		int[] k = new int[9];
		i = num1;
		for (j = 1; j < 10; j++) {
			k[j-1] = i*j;
		}
		return k;

	}
}
