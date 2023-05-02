import java.util.Scanner;

public class MultiTable {
	
	public MultiTable() {
		Scanner sc = new Scanner (System.in);
		String str;
		while(true) {
			str = sc.nextLine();
			
			System.out.println("1~999사이의 정수를 입력해주세요");
			try { // str을 정수로 파싱 시도
				a = Integer.parseInt(str);
			}
			catch(Exception ex) { // 에러
				System.out.println("정수가 아닙니다.");
			}
			if(a>0&&a<1000) // 범위인경우
				break;
			else // 범위를 벗어난 경우
				System.out.println("범위를 벗어났습니다.");
		}
		sc.close();
	}
	
	public void Print() {
		for(int i =1; i<10; i++)
			System.out.printf("%d x %d = %d\n",a,i,a*i);
	}
	
	public int a = 0;
}
