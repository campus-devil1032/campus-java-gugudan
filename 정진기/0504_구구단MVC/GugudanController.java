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
				
				if(dan == 0) {
					gugudanView.exitMassage();
					System.exit(0);
				}
				else if(dan <1 || dan >99) {
					throw new IllegalArgumentException();
				}else
				{
					gugudanModel.gugudanRun(dan);
				}
				//break;
			}
			catch(InputMismatchException e){
				scan.next();
				gugudanView.errorMassage("Error : InputMismatchException");
			}
			catch(IllegalArgumentException e) {
				gugudanView.errorMassage("Error : IllegalArgumenException");
			}
		}
	}
}
