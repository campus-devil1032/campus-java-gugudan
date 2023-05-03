package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFirstClass3 {
	
	public static void main(String[] args) throws Exception{
		//구구단 - 1~9단 출력
		//optional1 : 유저에게 단수를 입력받는다. 1~999까지의 입력만 유효하게 예외처리
		//TODO : Scanner -> BufferedReader 로 변경하기
		//TODO : Exception 범위 제한하기
		boolean quit=true;
		while(quit) {
//			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("구구단을 출력합니다. 원하는 단수를 입력해주세요 (종료는 q): ");
//			int number = sc.nextInt();
			String input = br.readLine();
			if(input.equals("q")) {	// String은 equal로 값을 비교
				quit = false;
				break;
			}
			else if(isInteger(input)) {
				int num = Integer.parseInt(input);
				int[] gugudan = calculate(num);
				viewGugudan(num,gugudan);
			}
		}
		
	}
	public static int[] calculate(int number) {
		int[] result = new int[9];
		for(int j=1;j<=9;j++) {
//			System.out.printf("%d X %d = %d%n",number,j,number*j);
			result[j-1] = number*j;
		}
		return result;
	}
	public static void viewGugudan(int number,int[] result) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d%n",number,i,result[i-1]);
		}
	}
	public static boolean isInteger(String number) {
		try {
			int num = Integer.parseInt(number);
			if(num>999 || num<1) 
					throw new IOException();
		}catch(NumberFormatException e){
			System.out.println("숫자를 입력해주세요.");
			return false;
		}catch(IOException e) {
			System.out.println("1~999까지만 입력해주세요.");
			return false;
		}
		
		return true;
	}
}
