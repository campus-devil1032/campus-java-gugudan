import java.util.Scanner;

public class View {

	void inPutView(Model model){
		System.out.println("출력 받으실 구구단을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.next();
		model.setStringInputData(inputData);
	}

	void outPutView(Model model) {
		System.out.println(model);
	}
}
