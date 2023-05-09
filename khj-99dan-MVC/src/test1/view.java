package test1;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
    	
        Controller con = new Controller();
        Gugu gugu = new Gugu();
        
        while(true) {
        	try {
        		System.out.println("정수를 입력해 주세요.");
        		System.out.println("0을 입력시, 종료합니다.");
        		con.numberInput(); // 입력을 controller클래스에서 해결
        		if(con.numberOutput() == 0) { // controller에서 입력된 값이 0이라면 종료
        			System.out.println("프로그램을 종료합니다.");
        			break; 
        		}
        		else { // 0이 아닌 정상범주의 값일경우
                		gugu.setNumber(con.numberOutput()); // 입력된 값을 구구단 클래스로 보내고
                    	gugu.getAnswer(); // 그 값으로 구구단을 계산해달라!
        		}
        	}catch (InputMismatchException errorRes) {
        		con.numberInput(); // 아직 예외처리에 대해 제대로 이해를 못한 것 같습니다 ㅠ
                System.out.println("error : 잘못된 입력입니다.");
        }
    }
}
}