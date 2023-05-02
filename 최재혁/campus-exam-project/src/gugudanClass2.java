import java.util.Scanner;

public class gugudanClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); //입력받은 숫자 i에 저장
		for (int j=1 ; j<10; j++) {
			System.out.println(i+"*"+j +"="+ i*j);
			sc.close();
		}
	}

}
