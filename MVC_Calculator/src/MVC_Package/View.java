package MVC_Package;
import java.util.Scanner;

public class View {

	String inputView(){
		System.out.println("몇 단이 궁금 하십니까?");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	void outPutView(DTO dto) {
		System.out.println("----최종 결과는 ----");
		System.out.println(dto);
		System.out.println("---입니다---");
	}
	
}
