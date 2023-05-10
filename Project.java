import java.util.Scanner;

public class Project {
	Scanner sc = new Scanner(System.in);
	
	class Gugudan {
		private int a;
		private int sum;
			
		public void runGugudan() {
			System.out.println("구구단을 계산할 단을 선택하세요");
			a = sc.nextInt();
				
				try {
					while(a <= 0 || a >= 1000) {
						System.out.println("1 이상 999 이하의 자연수만 입력해주세요");
						a = sc.nextInt();}
				} catch(NullPointerException e) {
					System.out.println("아무것도 입력되지 않았습니다");
				}
			for(int i=1; i<=9; i++) {
				sum = a*i;
				System.out.println(a+"*"+i+"="+sum);
				}
		}
	}
	public static void main(String[] args) {
		int b;
		Scanner sc = new Scanner(System.in);
		Project project = new Project();
		
		while (true) {
            System.out.println("구구단을 실행하고 싶으면 1번을, 계산기를 실행하고 싶으면 2번을 누르세요 (종료 버튼은 0을 눌러주세요)");
            b = sc.nextInt();
            if (b == 0) {
            	break;
            } else if (b == 1) {
            	Gugudan gu = project.new Gugudan();
            	gu.runGugudan();
            } else if (b == 2) {
            	
            }
		}
	}
}



