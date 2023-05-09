
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException {

		System.out.println("1 ~ 999 사이의 단수를 입력하세요 : "); // 입력하라는 문구
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 입력받기
		String num = input.readLine(); // 문자열로 입력값 받기
		int inputNum = Integer.parseInt(num); // 받아 온 문자열을 정수로 변환한 것을 변수로 받기

		if (inputNum > 999) {
			System.out.println("999 이하의 숫자를 입력하세요.");
		} 
		
		else if (inputNum < 1) {
			System.out.println("1 이하의 숫자를 입력하세요.");
		}
		
		else {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "X" + i + "=" + inputNum * i);
			}
		}

	}
}