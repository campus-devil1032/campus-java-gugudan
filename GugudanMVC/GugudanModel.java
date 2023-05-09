package GugudanMVC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanModel {
	
	public static void gugudanInput() {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 입력받기
		
		try {
			String num = input.readLine(); // 문자열로 입력값 받기
			
			int inputNum = Integer.parseInt(num); // 받아 온 문자열을 정수로 변환한 것을 변수로 받기

			if (inputNum > 999 || inputNum < 1) {
				System.out.println("1 ~ 999 사이의 숫자를 입력하세요.");
			}

			else {
				
				System.out.println(inputNum + "단 실행");
				for (int i = 1; i < 10; i++) {
					System.out.println(num + "X" + i + "=" + inputNum * i);
				}

			}
			
		}
		
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		catch (NullPointerException e) { //null 개체를 참조할 때
			System.out.println(e.getMessage());
		}
		
		catch (NumberFormatException e) { // 문자열을 숫자로 변환할 수 없을 때
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) { // 런타임 중에 발생하는 예외
			System.out.println(e.getMessage());
		}
		
	}
}
