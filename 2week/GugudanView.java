package homework;

public class GugudanView { // view
	GugudanModel model;

	public GugudanView(GugudanModel model) {
		this.model = model;
	}

	public void viewResult() {
		System.out.println(model.getDan() + "단을 출력합니다."); // 단 출력
		for (int i = 0; i < model.getResult().length; i++) { // 계산 결과 출력
			System.out.printf("%s * %d = %d%n", model.getDan(), i + 1, model.getResult()[i]);
		}
	}
}
