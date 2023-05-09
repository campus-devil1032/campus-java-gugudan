import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanController {

	public void gugudanRun() {
		
		Scanner scan = new Scanner(System.in);
		int dan;
		GugudanModel gugudanModel = new GugudanModel();
		GugudanView gugudanView = new GugudanView();
		
		System.out.println("구구단 프로그램입니다.");
		while(true) {
			gugudanView.getInput();
			try {
				dan = scan.nextInt();
				
				if(dan == 0) { //종료하기 선택
					gugudanView.exitMassage();
					System.exit(0);
				}
				else if(dan <1 || dan >99) { //범위 벗어나면 throw
					throw new IllegalArgumentException();
				}else
				{
					gugudanModel.gugudanRun(dan); //올바른 범위면 model 구구단 연산
				}		
			}
			catch(InputMismatchException e){ //숫자말고 다른 값 error (String이나 정수?)
				scan.next();
				gugudanView.errorMassageInputMismatchException();
			}
			catch(IllegalArgumentException e) { // 범위 넘는 숫자error ??
				gugudanView.errorMassageIllegalArgumenException();
			}
		}
	}
}
