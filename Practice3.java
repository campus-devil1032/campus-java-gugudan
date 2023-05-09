
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) {

		System.out.println("1 ~ 999 사이의 단수를 입력하세요 : "); // 입력하라는 문구
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 입력받기
		try {
			String num = input.readLine();
			
			int inputNum = Integer.parseInt(num); // 받아 온 문자열을 정수로 변환한 것을 변수로 받기

			if (inputNum > 999 || inputNum < 1) {
				System.out.println("1 ~ 999 사이의 숫자를 입력하세요.");
			}

			else {
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "X" + i + "=" + inputNum * i);
				}

			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // 문자열로 입력값 받기

	}
}