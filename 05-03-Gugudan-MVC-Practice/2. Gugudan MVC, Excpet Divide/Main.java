package test;

public class Main {
	
	public static void main(String[] args) {
	
		System.out.println("구구단 출력페이지 입니다.");
		System.out.println("1 ~ 999까지의 숫자 입력해주세요");
		
		Dto guguObject = new Dto(9);
		guguObject.setPrint("완료");
		System.out.println(guguObject.getPrint());
	
	}
	
}
