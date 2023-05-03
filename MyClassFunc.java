import java.util.*;

public class MyClassFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String scannumber = "";
		int max = 0;
		int min = 0;

		// 사용자로부터 구구단 시작 단수 끝 단수를 입력받습니다. 제한은 1~999입니다.
		// 조건을 만족할경우 break로 for문을 탈출합니다.
		// 정수외에 입력을 받았을경우 예외처리는 어떻게 해야할지 모르겠습니다. 구글링도 해보겠습니다.
		for (; true;) {
			try {
				
				System.out.println("출력하실 구구단의 시작 단수를 정수로 입력해주세요.(1~999)");
				scannumber = sc.next();
				if (isInteger(scannumber)!=true) {
					scannumber = "";
					continue;
				}else {
					min=Integer.parseInt(scannumber);
					scannumber="";
				}
				System.out.println("출력하실 구구단의 끝 단수를 정수로 입력해주세요.(1~999)");
				scannumber = sc.next();
				if (isInteger(scannumber)!=true) {
					scannumber = "";
					continue;
				}else {
					max=Integer.parseInt(scannumber);
					scannumber="";
				}

			} catch (NumberFormatException e) {
				System.out.println("입력 받은 값이 정수가 아닙니다..");
				
			}

			if (min != 0) {
				if (min <= 999) {
					if (max <= 999) {
						if (max >= min) {
							break;
						}
					}
				}
			}
			System.out.println("양식에 맞지않습니다. 다시 입력해주세요.");
		}

		/* 1단 ~ 9단 까지 출력하는 for문 입니다. */
		for (int i = min; i <= max; i++) {
			System.out.println(i + "단");
			for (int k = 1; k <= 9; k++) {
				System.out.println(i + "X" + k + "=" + i * k);
			}

		}

	}
	
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}

}
