import java.io.IOException;
import java.util.*;

public class Gugudan {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int dan = 0;
		System.out.print("단 수를 입력하세요 : ");
		
		while(true) {
			try {
				dan = sc.nextInt();
				if(dan < 1 || dan > 999) {
					System.out.println("유효하지 않은 숫자입니다.(1~999)");
				}
				else 
					break;
			}
			catch(Exception e){
				System.out.println("유효하지 않은 숫자입니다.(1~999)");
			}
		}
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		
		sc.close();
	}
}
