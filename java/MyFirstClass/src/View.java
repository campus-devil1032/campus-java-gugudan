import java.util.Scanner;

public class View {

	void inPutView(Model model){
		System.out.println("��� ������ �������� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.next();
		model.setStringInputData(inputData);
	}

	void outPutView(Model model) {
		System.out.println(model);
	}
}
